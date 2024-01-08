public class ExampleSwitch {
    public static void main(String[] args) {
        String extension = "pdf";

        switch (extension) {
            case "docx":
                System.out.println("This is a word document");
                break;
            case "pptx":
                System.out.println("This is a presentation");
                break;
            case "pdf":
                System.out.println("This is a pdf");
                break;
            default:
                System.out.println("We don't support this file!");
        }

        int month = 3;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("this month has 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("This month has 30 days");
                break;
            case 2:
                System.out.println("This month has 28 pr 29days");
                break;
            default:
                System.out.println("we don't have a month like that!");
        }

    }
}
