package com.example.demo.himart.controller;

import com.example.demo.bank.domain.AccountDTO;
import com.example.demo.himart.domain.PhoneApp;
import com.example.demo.himart.service.*;
import com.example.demo.himart.service.HimartService;
import com.example.demo.himart.service.HimartServiceImpl;
import com.example.demo.util.service.LambdaUtils;


import java.util.Scanner;

public class HimartController extends LambdaUtils {
    private final HimartService himartService;
    public HimartController() {
        himartService = new HimartServiceImpl();
    }
    public void main() {
        Scanner scanner = new Scanner(System.in);
        AccountDTO account = null;
        while (true) {
            System.out.println("[Menu] 0-Exit 1-스마트폰 2- 3- \n" + "\t   4- 5- 6-\n");
            switch (scanner.next()) {
                case "0":
                    return;
                case "1":
                    phoneMain(scanner);
                    break;
                case "2":

                    break;

                case "3":

                    break;
                case "4":
                    break;
                case "5":

                    break;
                case "6":

                    break;
            }
        }
    }
        public void phoneMain(Scanner scanner){
            PhoneApp phoneApp = new PhoneApp();
            PhoneApp.Phone phone = null;
            PhoneApp.CelPhone celPhone =null;
            PhoneApp.Iphone iphone =null;
            PhoneApp.GalaxyNote galaxyNote =null;
            while (true) {
                print.accept("[Menu] 0-종료 1-집전화 2-휴대폰 3-아이폰 4-갤럭시");
                switch (scanner.next()) {
                    case "0": return;
                    case "1":
                        phone= phoneApp.new Phone();
                        phone.setCall("여기 집이야...");
                        phone.setCompany("금성");
                        phone.setKind("집전화");
                        print.accept(phone.toString());
                        break;
                    case "2":
                        celPhone= phoneApp.new CelPhone();
                        celPhone.setCall("이동 중에 전화해");
                        celPhone.setKind("초콜릿폰");
                        celPhone.setCompany("엘지");
                        celPhone.setMove("이동");
                        celPhone.isPortable();
                        print.accept(celPhone.toString());
                        break;
                    case "3":
                        iphone= phoneApp.new Iphone();
                        iphone.setCall("아이폰으로 전화하고 있어...");
                        iphone.setCompany("애플");
                        iphone.setKind(PhoneApp.Iphone.BRAND);
                        iphone.setInternet("구글에 접속");
                        iphone.setMove("이동");
                        print.accept(iphone.toString());
                        break;
                    case "4":
                        galaxyNote= phoneApp.new GalaxyNote();
                        galaxyNote.setCall("갤럭시노트로 전화하고 있어..");
                        galaxyNote.setCompany("삼성");
                        galaxyNote.setKind(PhoneApp.GalaxyNote.BRAND);
                        galaxyNote.setInternet("네이버에 접속");
                        galaxyNote.setMove("이동");
                        galaxyNote.setPencil("노트펜슬을 사용하다");
                        print.accept(galaxyNote.toString());
                        break;
                }
            }
        }
    }


