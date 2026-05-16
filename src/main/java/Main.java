
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Instrument> inventory = new ArrayList<>();

        // 기타 (10개)
        inventory.add(new Guitar("아메리칸 프로 II 스트랫", 2800000, 0, "일렉트릭", "화이트", "펜더", 6, "스트라토캐스터", "싱글코일"));
        inventory.add(new Guitar("레스폴 스탠다드", 3900000, 0, "일렉트릭", "선버스트", "깁슨", 6, "레스폴", "험버커"));
        inventory.add(new Guitar("실버 스카이", 3500000, 0, "일렉트릭", "블루", "PRS", 6, "더블컷", "싱글코일"));
        inventory.add(new Guitar("RG550", 1400000, 0, "일렉트릭", "오렌지", "아이바네즈", 6, "슈퍼스트랫", "HSH"));
        inventory.add(new Guitar("214ce", 2100000, 0, "어쿠스틱", "내추럴", "테일러", 6, "GA바디", "ES2"));
        inventory.add(new Guitar("D-28", 4500000, 0, "어쿠스틱", "내추럴", "마틴", 6, "드레드넛", "없음"));
        inventory.add(new Guitar("카지노", 950000, 0, "일렉트릭", "선버스트", "에피폰", 6, "아치탑", "P-90"));
        inventory.add(new Guitar("화이트 팔콘", 5200000, 0, "일렉트릭", "화이트", "그레치", 6, "팔콘형", "필터트론"));
        inventory.add(new Guitar("퍼시피카", 350000, 0, "일렉트릭", "블루", "야마하", 6, "스트라토캐스터", "SSH"));
        inventory.add(new Guitar("클래식 바이브", 550000, 0, "일렉트릭", "선버스트", "스콰이어", 6, "스트라토캐스터", "싱글코일"));

        // 베이스 (10개)
        inventory.add(new Bass("아메리칸 프로 II 재즈 베이스", 2900000, 0, "일렉트릭", "내추럴", "펜더", 4, "재즈", "싱글코일"));
        inventory.add(new Bass("플레이어 프레시전", 1100000, 0, "일렉트릭", "블루", "펜더", 4, "프레시전", "스플릿"));
        inventory.add(new Bass("스팅레이", 3800000, 0, "일렉트릭", "블랙", "뮤직맨", 4, "스팅레이", "험버커"));
        inventory.add(new Bass("리켄배커 4003", 4200000, 0, "일렉트릭", "레드", "리켄배커", 4, "4003형", "싱글코일"));
        inventory.add(new Bass("스트리머 LX", 3500000, 0, "일렉트릭", "내추럴", "워릭", 4, "스트리머", "PJ"));
        inventory.add(new Bass("SR300E", 450000, 0, "일렉트릭", "그레이", "아이바네즈", 4, "SR형", "험버커"));
        inventory.add(new Bass("마커스 밀러 V7", 750000, 0, "일렉트릭", "화이트", "사이어", 4, "재즈", "싱글코일"));
        inventory.add(new Bass("유로 4 LX", 3900000, 0, "일렉트릭", "블랙", "스펙터", 4, "NS형", "PJ"));
        inventory.add(new Bass("BB434", 650000, 0, "일렉트릭", "블루", "야마하", 4, "BB형", "PJ"));
        inventory.add(new Bass("바이올린 베이스", 550000, 0, "일렉트릭", "선버스트", "헤프너", 4, "바이올린형", "스테이플"));

        // 드럼 (10개)
        inventory.add(new Drum("익스포트 EXX", 1200000, 0, "어쿠스틱", "블랙", "펄", 5, "포플러"));
        inventory.add(new Drum("임페리얼스타", 1100000, 0, "어쿠스틱", "레드", "타마", 5, "포플러"));
        inventory.add(new Drum("스테이지 커스텀", 1500000, 0, "어쿠스틱", "블랙", "야마하", 5, "자작나무"));
        inventory.add(new Drum("디자인 시리즈", 3200000, 0, "어쿠스틱", "체리", "DW", 5, "단풍나무"));
        inventory.add(new Drum("카탈리나 클럽", 1300000, 0, "어쿠스틱", "레드", "그레치", 4, "마호가니"));
        inventory.add(new Drum("클래식 메이플", 4500000, 0, "어쿠스틱", "실버", "루디윅", 3, "단풍나무"));
        inventory.add(new Drum("AQ2 밥", 1800000, 0, "어쿠스틱", "화이트", "소너", 4, "단풍나무"));
        inventory.add(new Drum("마스 버치", 1250000, 0, "어쿠스틱", "우드", "메이펙스", 5, "자작나무"));
        inventory.add(new Drum("야이바 II", 2800000, 0, "어쿠스틱", "레드", "캐노푸스", 5, "자작나무"));
        inventory.add(new Drum("V-드럼 TD-17", 2500000, 0, "일렉트릭", "블랙", "롤랜드", 5, "고무/메쉬"));

        Scanner scanner = new Scanner(System.in);
        boolean isStoreOpen = true;

        System.out.println("=============john's 악기 상점============");

        while(isStoreOpen){
            System.out.println("\n원하시는 악기 카테고리(숫자)를 선택해주세요.");
            System.out.println("1. 기타 | 2. 베이스 | 3. 드럼 |4. 종료 ");
            System.out.print("입력: ");

            int category = scanner.nextInt();

            if(category == 1){
                System.out.println(" '기타'를 선택하셨습니다! 어떤 타입을 원하나요?");
                System.out.println("1. 어쿠스틱 | 2. 일렉트릭");
                System.out.println("입력: ");

                int typeChoice = scanner.nextInt();

                if(typeChoice == 1){
                    String targetType = (typeChoice == 1) ? "어쿠스틱" : "일렉트릭";

                    System.out.println("\n" + "=".repeat(120));
                    System.out.printf("| %-5s | %-12s | %-25s | %-15s | %-10s | %-10s | %-15s |\n",
                            "번호", "브랜드", "모델명", "가격", "타입", "색상", "상세사양");
                    System.out.println("-".repeat(120));

                    int i = 1; // 화면에 보여줄 순번 (1부터 시작)

                    for (Instrument inst : inventory) {
                        if (inst instanceof Guitar && inst.getType().equals(targetType)) {
                            Guitar g = (Guitar) inst;
                            String detail = g.getNumberOfString() + "현 / " + g.getShape();


                            System.out.printf("| %-5d | %-12s | %-25s | %,13d원 | %-10s | %-10s | %-15s |\n",
                                    i, g.getBrand(), g.getName(), g.getPrice(), g.getType(), g.getColor(), detail);

                            i++;
                        }
                    }

                    if (i == 1) {
                        System.out.println("   [!] 해당 조건에 맞는 악기가 현재 매장에 없습니다.");
                    }
                    System.out.println("=".repeat(120));
                }else if(typeChoice == 2){
                    String targetType = (typeChoice == 2) ? "일렉트릭" : "어쿠스틱";

                    System.out.println("\n" + "=".repeat(120));
                    System.out.printf("| %-5s | %-12s | %-25s | %-15s | %-10s | %-10s | %-15s |\n",
                            "번호", "브랜드", "모델명", "가격", "타입", "색상", "상세사양");
                    System.out.println("-".repeat(120));

                    int i = 1; // 화면에 보여줄 순번 (1부터 시작)

                    for (Instrument inst : inventory) {
                        if (inst instanceof Guitar && inst.getType().equals(targetType)) {
                            Guitar g = (Guitar) inst;
                            String detail = g.getNumberOfString() + "현 / " + g.getShape();


                            System.out.printf("| %-5d | %-12s | %-25s | %,13d원 | %-10s | %-10s | %-15s |\n",
                                    i, g.getBrand(), g.getName(), g.getPrice(), g.getType(), g.getColor(), detail);
                            i++;
                        }
                    }
                    if (i == 1) {
                        System.out.println("   [!] 해당 조건에 맞는 악기가 현재 매장에 없습니다.");
                    }
                    System.out.println("=".repeat(120));
                }else{
                    System.out.println("잘못된 입력입니다.");
                }
            }else if(category == 2){
                System.out.println(" '베이스'를 선택하셨습니다! 어떤 타입을 원하나요?");
                System.out.println("1. 어쿠스틱 | 2. 일렉트릭");
                System.out.println("입력: ");

                int typeChoice = scanner.nextInt();

                if(typeChoice == 1){
                    String targetType = (typeChoice == 1) ? "어쿠스틱" : "일렉트릭";

                    System.out.println("\n" + "=".repeat(120));
                    System.out.printf("| %-5s | %-12s | %-25s | %-15s | %-10s | %-10s | %-15s |\n",
                            "번호", "브랜드", "모델명", "가격", "타입", "색상", "상세사양");
                    System.out.println("-".repeat(120));

                    int i = 1; // 화면에 보여줄 순번 (1부터 시작)

                    for (Instrument inst : inventory) {
                        if (inst instanceof Bass && inst.getType().equals(targetType)) {
                            Bass b = (Bass) inst;
                            String detail = b.getNumberOfString() + "현 / " + b.getShape();


                            System.out.printf("| %-5d | %-12s | %-25s | %,13d원 | %-10s | %-10s | %-15s |\n",
                                    i, b.getBrand(), b.getName(), b.getPrice(), b.getType(), b.getColor(), detail);
                            i++;
                        }
                    }
                    if (i == 1) {
                        System.out.println("   [!] 해당 조건에 맞는 악기가 현재 매장에 없습니다.");
                    }
                    System.out.println("=".repeat(120));
                }else if(typeChoice == 2){
                    String targetType = (typeChoice == 2) ? "일렉트릭" : "어쿠스틱";

                    System.out.println("\n" + "=".repeat(120));
                    System.out.printf("| %-5s | %-12s | %-25s | %-15s | %-10s | %-10s | %-15s |\n",
                            "번호", "브랜드", "모델명", "가격", "타입", "색상", "상세사양");
                    System.out.println("-".repeat(120));

                    int i = 1; // 화면에 보여줄 순번 (1부터 시작)

                    for (Instrument inst : inventory) {
                        if (inst instanceof Bass && inst.getType().equals(targetType)) {
                            Bass b = (Bass) inst;
                            String detail = b.getNumberOfString() + "현 / " + b.getShape();


                            System.out.printf("| %-5d | %-12s | %-25s | %,13d원 | %-10s | %-10s | %-15s |\n",
                                    i, b.getBrand(), b.getName(), b.getPrice(), b.getType(), b.getColor(), detail);
                            i++;
                        }
                    }
                    if (i == 1) {
                        System.out.println("   [!] 해당 조건에 맞는 악기가 현재 매장에 없습니다.");
                    }
                    System.out.println("=".repeat(120));
                }else{
                    System.out.println("잘못된 입력입니다.");
                }
            }else if(category == 3){
                System.out.println(" '드럼'을 선택하셨습니다! 어떤 타입을 원하나요?");
                System.out.println("1. 어쿠스틱 | 2. 일렉트릭");
                System.out.println("입력: ");

                int typeChoice = scanner.nextInt();

                if(typeChoice == 1){
                    String targetType = (typeChoice == 1) ? "어쿠스틱" : "일렉트릭";
                    System.out.println("\n" + "=".repeat(120));
                    System.out.printf("| %-5s | %-12s | %-25s | %-15s | %-10s | %-10s | %-15s |\n",
                            "번호", "브랜드", "모델명", "가격", "타입", "색상", "상세사양");
                    System.out.println("-".repeat(120));

                    int i = 1;

                    for (Instrument inst : inventory) {
                        if (inst instanceof Drum && inst.getType().equals(targetType)) {

                            Drum d = (Drum) inst;

                            String detail = d.getPieceCount() + "기통 / " + d.getMaterial();

                            System.out.printf("| %-5d | %-12s | %-25s | %,13d원 | %-10s | %-10s | %-15s |\n",
                                    i, d.getBrand(), d.getName(), d.getPrice(), d.getType(), d.getColor(), detail);
                            i++;
                        }
                    }
                    if (i == 1) {
                        System.out.println("   [!] 해당 조건에 맞는 악기가 현재 매장에 없습니다.");
                    }
                    System.out.println("=".repeat(120));
                }else if(typeChoice == 2) {
                    // 드럼용 타입 선택 로직 (1: 어쿠스틱, 2: 일렉트릭 기준)
                    String targetType = (typeChoice == 2) ? "일렉트릭" : "어쿠스틱";

                    System.out.println("\n" + "=".repeat(120));
                    System.out.printf("| %-5s | %-12s | %-25s | %-15s | %-10s | %-10s | %-15s |\n",
                            "번호", "브랜드", "모델명", "가격", "타입", "색상", "상세사양");
                    System.out.println("-".repeat(120));

                    int i = 1; // 화면에 보여줄 순번 (1부터 시작)

                    for (Instrument inst : inventory) {
                        // 1. 드럼인지 확인하고 타입이 맞는지 검사
                        if (inst instanceof Drum && inst.getType().equals(targetType)) {
                            // 2. 드럼 전용 데이터를 위해 다운캐스팅
                            Drum d = (Drum) inst;

                            // 3. 드럼만의 상세 사양 만들기 (기통 수 + 재질)
                            String detail = d.getPieceCount() + "기통 / " + d.getMaterial();

                            // 4. 표 형식에 맞춰 출력
                            System.out.printf("| %-5d | %-12s | %-25s | %,13d원 | %-10s | %-10s | %-15s |\n",
                                    i, d.getBrand(), d.getName(), d.getPrice(), d.getType(), d.getColor(), detail);
                            i++;
                        }
                    }

                    if (i == 1) {
                        System.out.println("   [!] 해당 조건에 맞는 악기가 현재 매장에 없습니다.");
                    }
                    System.out.println("=".repeat(120));
                }else if(category == 4){
                    isStoreOpen = false;
                }else{
                    System.out.println("잘못된 입력입니다.");
                }
            }else{
                System.out.println("잘못된 입력입니다.");
            }


        }

    }
}