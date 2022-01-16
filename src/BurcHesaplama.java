import java.util.Scanner;

public class BurcHesaplama {
    public static void main(String[] args) {
        int day, month;
        String burc = "";
        boolean isError = false;

        Scanner data = new Scanner(System.in);

        System.out.print("Doğduğunuz ay :");
        month = data.nextInt();

        System.out.print("Doğduğunuz gün :");
        day = data.nextInt();

        if (month == 1) {
            if (0 < day && day < 32) {
                if (day < 22) {
                    burc = "Oğlak";
                } else {
                    burc = "Kova";
                }
            } else {
                isError = true;
            }
        } else if (month == 2) {
            if (0 < day && day < 29) {
                if (day < 20) {
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }
            } else {
                isError = true;
            }
        } else if (month == 3) {
            if (0 < day && day < 32) {
                if (day < 21) {
                    burc = "Balık";
                } else {
                    burc = "Koç";
                }
            } else {
                isError = true;
            }
        } else if (month == 4) {
            if (0 < day && day < 31) {
                if (day < 21) {
                    burc = "Koç";
                } else {
                    burc = "Boğa";
                }
            } else {
                isError = true;
            }
        } else if (month == 5) {
            if (0 < day && day < 32) {
                if (day < 22) {
                    burc = "Boğa";
                } else {
                    burc = "İkizler";
                }
            } else {
                isError = true;
            }
        } else if (month == 6) {
            if (0 < day && day < 31) {
                if (day < 23) {
                    burc = "İkizler";
                } else {
                    burc = "Yengeç";
                }
            } else {
                isError = true;
            }
        } else if (month == 7) {
            if (0 < day && day < 32) {
                if (day < 23) {
                    burc = "Yengeç";
                } else {
                    burc = "Aslan";
                }
            } else {
                isError = true;
            }
        } else if (month == 8) {
            if (0 < day && day < 32) {
                if (day < 23) {
                    burc = "Aslan";
                } else {
                    burc = "Başak";
                }
            } else {
                isError = true;
            }
        } else if (month == 9) {
            if (0 < day && day < 31) {
                if (day < 23) {
                    burc = "Başak";
                } else {
                    burc = "Terazi";
                }
            } else {
                isError = true;
            }
        } else if (month == 10) {
            if (0 < day && day < 32) {
                if (day < 23) {
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
            } else {
                isError = true;
            }
        } else if (month == 11) {
            if (0 < day && day < 31) {
                if (day < 22) {
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
            } else {
                isError = true;
            }
        } else if (month == 12) {
            if (0 < day && day < 32) {
                if (day < 22) {
                    burc = "Yay";
                } else {
                    burc = "Oğlak";
                }
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        if (isError) {
            System.out.println();
            System.out.println("Hatalı giriş yaptınız");
        } else {
            System.out.println();
            System.out.println("Burcunuz :" + burc);
        }
    }
}
