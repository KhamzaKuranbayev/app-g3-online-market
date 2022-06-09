import controller.RoleController;
import dto.RoleDto;
import dto.response.Response;

import java.util.Scanner;

public class Runnable {
    public static RoleController roleController = new RoleController();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Role saqlash ni test qilamiz
        System.out.print("Role nomini kiriting: ");
        String roleName = scanner.next();

        System.out.print("Role ga tavsif yozing: ");
        String description = scanner.next();

        Response response = roleController.save(new RoleDto(roleName, description));
        System.out.println(response);
    }
}
