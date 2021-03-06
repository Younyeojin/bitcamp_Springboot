package com.example.demo.himart.domain;


import lombok.Data;

public class PhoneApp {
    @Data public class Phone {
        protected String kind, company, call;
        @Override public String toString() {
            return "집전화기{" +
                    "폰종류='" + kind + '\'' +
                    ", 제조사='" + company + '\'' +
                    ", 통화='" + call + '\'' +
                    '}';
        }
    }
    @Data public class CelPhone extends Phone {
        protected boolean portable;
        protected String move;
        @Override public String toString() {
            return "휴대전화기{" +
                    "폰종류='" + kind + '\'' +
                    ", 제조사='" + company + '\'' +
                    ", 이동='" + move + '\'' +
                    ", 통화='" + call + '\'' +
                    '}';
        }
    }
    @Data public class Iphone extends CelPhone {
        public final static String BRAND = "아이폰";
        protected String internet;
        @Override public String toString() {
            return "스마트폰{" +
                    "브랜드='" + BRAND + '\'' +
                    ", 제조사='" + company + '\'' +
                    ", 이동='" + move + '\'' +
                    ", 통화='" + call + '\'' +
                    ", 검색='" + internet + '\'' +
                    '}';
        }
    }
        @Data public class GalaxyNote extends Iphone {
            public final static String BRAND = "갤럭시폰";    //오버라이딩
            protected String pencil;
            @Override public String toString() {
                return "스마트폰{" +
                        "브랜드='" + BRAND + '\'' +
                        ", 이동='" + move + '\'' +
                        ", 통화='" + call + '\'' +
                        ", 검색='" + internet + '\'' +
                        ", 펜슬='" + pencil + '\'' +
                        '}';
            }
        }
    }



