// public class MNestedLoop {
//     public static void main(String[] args) {
//         for( int i = 1; i < 3; i++){

//             for(int j = 1; j <= 4; j++);{
//             System.out.println("i = " + i + ", j = " + j);
            
//             }
//         }
//     }
// }


// public class MNestedLoop {
//     public static void main(String[] args) {
//       for (int i = 1; i <= 2; i++) {
//         for (int j = 1; j <= 3; j++) {
//             System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }



// public class MNestedLoop {
//     public static void main(String[] args) {
//       for(int i = 1; i <= 3; i++){
//         for(int j = 1; j <= 5; j++){
//             System.out.print(j + " ");
//         }
//         System.out.println();
//       }
//     }
// }


// public class MNestedLoop {
//     public static void main(String[] args) {
//       for(int i = 1; i <= 5; i++){
//         for(int j = 1; j <= i; j++ ){
//             System.out.print(j + " ");
//         }
//         System.out.println();
//       }
//     }
// }


public class MaNestedLoop {
    public static void main(String[] args) {
      for (int i = 1; i <= 5; i++){
        for(int j = 1; j <= 6 - i; j++){
            System.out.print(j + " ");
        }
        System.out.println();
      }
    }
}