import multimedia.Audio;
import multimedia.Image;
import multimedia.Multimedia;
import multimedia.Video;

void main() {
    Multimedia[] media = new Multimedia[5];

    for (int i = 0; i < media.length; i++) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Choose your media: Audio, Video or Image?");
    switch (sc.nextLine()) {
        case "Audio":
            System.out.println("Enter title:");
            String title = sc.nextLine();
            System.out.println("Choose volume from 0 to 10:");
            int volume = sc.nextInt();
            System.out.println("Choose duration from 0 to 5:");
            int duration = sc.nextInt();
            Audio audio = new Audio(title, volume, duration);
            media[i] = audio;
            System.out.println(audio.play());
        break;
        case "Video":
            System.out.println("Enter title:");
            String title2 = sc.nextLine();
            System.out.println("Choose volume from 0 to 10:");
            int volume2 = sc.nextInt();
            System.out.println("Choose brightness from 0 to 5:");
            int brightness = sc.nextInt();
            System.out.println("Choose duration from 0 to 10:");
            int duration2 = sc.nextInt();
            Video video = new Video(title2, volume2, brightness, duration2);
            media[i] = video;
            System.out.println(video.play());
        break;
        case "Image":
            System.out.println("Choose title:");
            String title3 = sc.nextLine();
            System.out.println("Choose brightness from 0 to 5:");
            int brightness2 = sc.nextInt();

            Image image = new Image(title3, brightness2);
            media[i] = image;
            System.out.println(image.Show());
            break;
            default:
                System.out.println("Invalid input");
    }
    }


    for (int i = 0; i < media.length; i++) {
        switch (media[i].toString().charAt(11)) {
            case 'V' :
                System.out.println(((Video) media[i]).play());
                break;
            case 'A' :
                System.out.println(((Audio) media[i]).play());
                break;
            case 'I' :
                System.out.println(((Image) media[i]).Show());
                break;
                default:
                    System.out.println("Invalid input");
        }
    }
}
