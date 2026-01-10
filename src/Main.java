import multimedia.Audio;
import multimedia.Video;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
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
            System.out.println(audio.getDuration());
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
            System.out.println(video.getDuration());
        break;
        case "Image": ;
    }
}
