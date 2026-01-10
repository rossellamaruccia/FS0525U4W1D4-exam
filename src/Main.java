import multimedia.Audio;
import multimedia.Image;
import multimedia.Multimedia;
import multimedia.Video;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Multimedia[] media = new Multimedia[5];

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
            media[0] = audio;
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
            System.out.println(video.play());
        break;
        case "Image":
            System.out.println("Choose title:");
            String title3 = sc.nextLine();
            System.out.println("Choose brightness from 0 to 5:");
            int brightness2 = sc.nextInt();

            Image image = new Image(title3, brightness2);
            System.out.println(image.Show());
            System.out.println("If you want to decrease or increase brightness, press < or >; otherwise, press anything else");
            String choice = sc.nextLine();
            switch (choice) {
                case "<":image.decreaseBrightness();
                    System.out.println(image.Show());
                    break;
                case ">": image.increaseBrightness();
                    System.out.println(image.Show());
                    break;
                default: break;
            }
            break;
            default:
                System.out.println("Invalid input");
    }
}
