package common;

import model.*;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WriteAndReadFunc<E> {

    //ghi vào file
    public void writeToCSVFile(List<E> list, boolean status){
        try {
            if (list.size() == 0) {
                System.err.println("Danh sách trống");
                return;
            }
            String path;
            if (list.get(0) instanceof Villa) {
                path = "src/data/villas.csv";
            } else if (list.get(0) instanceof House) {
                path = "src/data/houses.csv";
            } else if (list.get(0) instanceof Room) {
                path = "src/data/rooms.csv";
            } else if (list.get(0) instanceof Customer) {
                path = "src/data/customers.csv";
            } else {
                System.err.println("Đối tượng phải là kiểu Villa, House, Room hoặc Customer");
                return;
            }
            //ghi vào file
            FileWriter fileWriter = new FileWriter(path, status);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (E object: list) {
                bufferedWriter.write(object.toString() + "\n");
            }
            bufferedWriter.close();
            System.out.println("\n---Thêm vào file thành công!---");
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File không tồn tại!!!");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    //kiểm tra đã tồn tại ID hay chưa
    public boolean isIdExist(String id, String fileName) {
        switch (fileName) {
            case "villas.csv": {
                List<Villa> list = readVillasFile();
                for (Villa o : list) {
                    if (o.getId().equals(id)) {
                        return true;
                    }
                }
                break;
            }
            case "houses.csv": {
                List<House> list = readHousesFile();
                for (House o : list) {
                    if (o.getId().equals(id)) {
                        return true;
                    }
                }
                break;
            }
            case "rooms.csv": {
                List<Room> list = readRoomsFile();
                for (Room o : list) {
                    if (o.getId().equals(id)) {
                        return true;
                    }
                }
                break;
            }
            case "customers.csv": {
                List<Customer> list = readCustomersFile();
                for (Customer o : list) {
                    if (o.getId().equals(id)) {
                        return true;
                    }
                }
                break;
            }
        }
        return false;
    }

    //show customers.csv
    public List<Customer> readCustomersFile() {
        final String PATH = "src/data/customers.csv";
        List<Customer> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("\\|");
                if (words[8].equals("null")) {
                    list.add(new Customer(words[0], words[1], words[2], words[3], words[4], words[5], words[6], words[7]));
                }else {
                    Services services = searchServiceById(words[8]);
                    list.add(new Customer(words[0], words[1], words[2], words[3], words[4], words[5], words[6], words[7], services));
                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("Không tìm thấy file!!!");
        } catch (Exception e) {
            System.err.println("Dữ liệu file không khả dụng!!!");
        }
        return list;
    }

    //đọc file villas.csv
    public List<Villa> readVillasFile() {
        final String PATH = "src/data/villas.csv";
        List<Villa> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("\\|");
                list.add(new Villa(words[0], words[1], Float.parseFloat(words[2]), Float.parseFloat(words[3]), Integer.parseInt(words[4]), words[5], Integer.parseInt(words[6]), words[7], words[8], Float.parseFloat(words[9]), Integer.parseInt(words[10])));
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("Không tìm thấy file!!!");
        } catch (Exception e) {
            System.err.println("Dữ liệu file không khả dụng!!!");
        }
        return list;
    }

    //đọc file houses.csv
    public List<House> readHousesFile() {
        final String PATH = "src/data/houses.csv";
        List<House> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("\\|");
                list.add(new House(words[0], words[1], Float.parseFloat(words[2]), Float.parseFloat(words[3]), Integer.parseInt(words[4]), words[5], Integer.parseInt(words[6]), words[7], words[8], Integer.parseInt(words[9])));
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File is not founded!!!");
        } catch (Exception e) {
            System.err.println("Data of file is not correct!!!");
        }
        return list;
    }

    //đọc file rooms.csv
    public List<Room> readRoomsFile() {
        final String PATH = "src/data/rooms.csv";
        List<Room> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("\\|");
                list.add(new Room(words[0], words[1], Float.parseFloat(words[2]), Float.parseFloat(words[3]), Integer.parseInt(words[4]), words[5], Integer.parseInt(words[6]), words[7], Integer.parseInt(words[8]), Float.parseFloat(words[9])));
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("Không tìm thấy file!!!");
        } catch (Exception e) {
            System.err.println("Dữ liệu file không khả dụng!!!");
        }
        return list;
    }

    //search by ID
    public Services searchServiceById(String id) {
        String typeOfService = id.substring(0, 4);
        if (typeOfService.equals("SVVL")) {
            List<Villa> list = readVillasFile();
            for (Villa villa : list) {
                if (villa.getId().equals(id)) {
                    return villa;
                }
            }
            return null;
        } else if (typeOfService.equals("SVHO")) {
            List<House> list = readHousesFile();
            for (House house : list) {
                if (house.getId().equals(id)) {
                    return house;
                }
            }
            return null;
        } else if (typeOfService.equals("SVRO")) {
            List<Room> list = readRoomsFile();
            for (Room room : list) {
                if (room.getId().equals(id)) {
                    return room;
                }
            }
            return null;
        } else {
            System.out.println("---LỖI: ID tìm kiếm không hợp lệ---");
            return null;
        }
    }

    public void writeBookingCsv(String idService, String idCustomer) {
        final String PATH = "src/data/booking.csv";
        try {
            FileWriter fileWriter = new FileWriter(PATH,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(idService + "|" + idCustomer + "\n");
            bufferedWriter.close();
            System.out.println("\n---Đặt phòng thành công!---\n");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public Map<String, String> readBookingCsv() {
        final String PATH = "src/data/booking.csv";
        Map<String, String> map = new LinkedHashMap<>();
        try {
            FileReader fileReader = new FileReader(PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while((line = bufferedReader.readLine()) != null){
                String[] words = line.split("\\|");
                map.put(words[0], words[1]);
            }
            bufferedReader.close();
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("---Không tìm thấy file!---");
        } catch (IOException ioException) {
            System.err.println("---Lỗi đọc file!---");
        }
        return map;
    }

    public Map<Integer, Employee> readEmployeeFile(){
        final String PATH = "src/data/employee.csv";
        Map<Integer, Employee> map = new LinkedHashMap<>();
        try {
            FileReader fileReader = new FileReader(PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            int i = 1;
            while((line = bufferedReader.readLine()) != null){
                String[] words = line.split("\\|");
                Employee employee = new Employee(words[0], Integer.parseInt(words[1]), words[2]);
                map.put(i++, employee);
            }
            bufferedReader.close();
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("---Không tìm thấy file!---");
        } catch (IOException ioException) {
            System.err.println("---Lỗi đọc file!---");
        }
        return map;
    }
}
