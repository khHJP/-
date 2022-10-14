package net.network.test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("호스트명(도메인명): ");
		String name = sc.next();

		try {
			InetAddress[] host = InetAddress.getAllByName(name);
			if (host.length >= 1) {
				for (InetAddress n : host) {
					System.out.println(n.getHostAddress());
				}
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
