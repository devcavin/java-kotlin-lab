package kotlinlab.koans

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

const val CAMEL = """Switching on the camera in the camel habitat...
 ___.-''''-.
/___  @    |
',,,,.     |         _.'''''''._
     '     |        /           \
     |     \    _.-'             \
     |      '.-'                  '-.
     |                               ',
     |                                '',
      ',,-,                           ':;
           ',,| ;,,                 ,' ;;
              ! ; !'',,,',',,,,'!  ;   ;:
             : ;  ! !       ! ! ;  ;   :;
             ; ;   ! !      ! !  ; ;   ;,
            ; ;    ! !     ! !   ; ;
            ; ;    ! !    ! !     ; ;
           ;,,      !,!   !,!     ;,;
           /_I      L_I   L_I     /_I
Look at that! Our little camel is sunbathing!"""

const val LION = """Switching on the camera in the lion habitat...
                                               ,w.
                                             ,YWMMw  ,M  ,
                        _.---.._   __..---._.'MMMMMw,wMWmW,
                   _.-""        '''           YP"WMMMMMMMMMb,
                .-' __.'                   .'     MMMMW^WMMMM;
    _,        .'.-'"; `,       /`     .--""      :MMM[==MWMW^;
 ,mM^"     ,-'.'   /   ;      ;      /   ,       MMMMb_wMW"  @\
,MM:.    .'.-'   .'     ;     `\    ;     `,     MMMMMMMW `"=./`-,
WMMm__,-'.'     /      _.\      F'''-+,,   ;_,_.dMMMMMMMM[,_ / `=_}
"^MP__.-'    ,-' _.--""   `-,   ;       \  ; ;MMMMMMMMMMW^``; __|
           /   .'            ; ;         )  )`{  \ `"^W^`,   \  :
          /  .'             /  (       .'  /     Ww._     `.  `"
         /  Y,              `,  `-,=,_{   ;      MMMP`""-,  `-._.-,
        (--, )                `,_ / `) \/"")      ^"      `-, -;"\:
The lion is roaring!"""

const val DEAR = """Switching on the camera in the deer habitat...
   /|       |\
`__\\       //__'
   ||      ||
 \__`\     |'__/
   `_\\   //_'
   _.,:---;,._
   \_:     :_/
     |@. .@|
     |     |
     ,\.-./ \
     ;;`-'   `---__________-----.-.
     ;;;                         \_\
     ';;;                         |
      ;    |                      ;
       \   \     \        |      /
        \_, \    /        \     |\
          |';|  |,,,,,,,,/ \    \ \_
          |  |  |           \   /   |
          \  \  |           |  / \  |
           | || |           | |   | |
           | || |           | |   | |
           | || |           | |   | |
           |_||_|           |_|   |_|
          /_//_/           /_/   /_/
Our 'Bambi' looks hungry. Let's go to feed it!"""

const val GOOSE = """Switching on the camera in the goose habitat...

                                    _
                                ,-"" "".
                              ,'  ____  `.
                            ,'  ,'    `.  `._
   (`.         _..--.._   ,'  ,'        \    \
  (`-.\    .-""        ""'   /          (  d _b
 (`._  `-"" ,._             (            `-(   \
 <_  `     (  <`<            \              `-._\
  <`-       (__< <           :
   (__        (_<_<          ;
    `------------------------------------------
The goose is staring intently at you... Maybe it's time to change the channel?"""

const val BAT = """Switching on the camera in the bat habitat...
_________________               _________________
 ~-.              \  |\___/|  /              .-~
     ~-.           \ / o o \ /           .-~
        >           \\  W  //           <
       /             /~---~\             \
      /_            |       |            _\
         ~-.        |       |        .-~
            ;        \     /        i
           /___      /\   /\      ___\
                ~-. /  \_/  \ .-~
                   V         V
This bat looks like it's doing fine."""

const val RABBIT = """Switching on the camera in the rabbit habitat...
         ,
        /|      __
       / |   ,-~ /
      Y :|  //  /
      | jj /( .^
      >-"~"-v"
     /       Y
    jo  o    |
   ( ~T~     j
    >._-' _./
   /   "~"  |
  Y     _,  |
 /| ;-"~ _  l
/ l/ ,-"~    \
\//\/      .- \
 Y        /    Y
 l       I     !
 ]\      _\    /"\
(" ~----( ~   Y.  )
It looks like we will soon have more rabbits!"""

const val ELEPHANT = """Switching on the camera in the elephant habitat...
     __     ______  _
  _ /  \   |  ____|/ |
 | |/ _  |  | |__  | |
 | | |_| |  |  __| | |
 | |__|_|   | |___ |_|
  \______|  |_____||_|
The elephant looks calm, flapping its big ears!"""

const val ZEBRA = """Switching on the camera in the zebra habitat...
       /|  __/|_    
     (_/\|   ||      /\     
  __/  /\_/|  ||    /_/__
 /_/  o o ||__/|    |o o|__
|  |      ||  ||____/     _|
 \_|   o_ ||_/_|_   o    /
    ||  _/       \_ __  /
The zebra's stripes are mesmerizing, aren't they?"""

const val PANDA = """Switching on the camera in the panda habitat...
(\_ _/)
(='.'=)
(")_(")
The panda is chewing on some bamboo shoots. Adorable!"""

fun getAnimal(index: Any): String {
    val listOfAnimals = listOf(CAMEL, LION, DEAR, GOOSE, BAT, RABBIT, ELEPHANT, ZEBRA, PANDA)
    return listOfAnimals.getOrElse(index as Int) { "Animal isn't found!" }
}

fun main() {
    while (true) {
        print("Enter the index of your favorite animal (or 'q' to quit): ")
        val input = readlnOrNull()?.trim()

        if (input.equals("q", ignoreCase = true) || input.equals("quit", ignoreCase = true)) {
            println("Exiting the zookeeper game. Goodbye!")
            break
        }

        val index = input?.toIntOrNull()
        if (index != null && index >= 0) { // Valid index
            println("""
            ------------------------------------------------------------
            ${getAnimal(index)}
            ------------------------------------------------------------
            """.trimIndent())
        } else {
            println("Invalid input. Please provide a valid index or type 'q' or 'quit' to quit.")
        }
    }
}