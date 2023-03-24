
public class main {
    public static <bukuSejarah> void main(String[] args) {
        buku teknologi1 = new buku("Homo Deus", "786026577337", "Yuval Noah Harari", "448",
                "Buku “Homo Deus”, Yuval Noah Harari menjelaskan tentang peradaban manusia pada masa saat ini sekaligus peradaban manusia pada 100 tahun sebelumnya. Menurut Yuval Noah Harari, manusia mampu mengatasi tiga buah masalah dalam hidupnya yaitu kelaparan, wabah penyakit hingga kondisi perang pada zaman dahulu.");
        buku teknologicopy1 = teknologi1.copy();
        buku teknologi2 = new buku("The Shallows", "9780393357820", "Nicholas Carr", "280",
                "Buku  ini menunjukkan bagaimana “alat-alat berpikir”yang telah kita gunakan selama berabad-abad dapat mengubah cara kerja otak kita. Membaca buku cetak membuat kita dapat memfokuskan perhatian, mendorong aktivitas berpikir mendalam dan kreatif. Sebaliknya, Internet memaksa kita menelan informasi secara instan, cepat, dan massal, sehingga membuat pikiran kita mudah teralihkan. Kita menjadi terbiasa membaca serba kilat dan cepat menyaring informasi, tetapi akibatnya kita juga kehilangan kapasitas untuk berkonsentrasi, merenung, dan berpikir mendalam.");
        buku teknologicopy2 = teknologi2.copy();
        buku teknologi3 = new buku("The Great Shifting", "9786020387604", "Rhenald kasali", "584",
                "Buku karangan Rhenald Kasali ini menyajikan pandangan mengenai perubahan besar yang terjadi pada perilaku masyarakat saat ini dengan adanya teknologi informasi. Perubahan ini juga berdampak pada aktivitas bisnis yang berpindah dari dunia industri ke dunia digital. Buku ini membuka wawasan mengenai kondisi saat ini bahwasannya kita lebih baik pegang kendali daripada dikuasai.");

        buku teknologicopy3 = teknologi3.copy();buku
                teknologi4 = new buku("Everybody Lies", "9786020612096", "Seth Stephens", "336",
                "Dalam karya terobosan ini, Seth Stephens-Davidowitz, ekonom lulusan Harvard, berargumen bahwa banyak hal yang kita pikirkan tentang orang lain sebenarnya sangatlah keliru. Kenapa begitu? Orang berbohong, kepada teman, pasangan, dokter, survei dan diri mereka sendiri. Namun, kita tak lagi perlu mengandalkan apa yang orang katakan kepada kita.");
        buku teknologicopy4 = teknologi4.copy();
        buku teknologi5 = new buku("The Death of Expertise", "9780190865979", "Tom Nichols", "280",
                "Buku “The Death of Expertise” karya Tom Nichols membahas mengenai fenomena yang terjadi saat ini, yaitu mengabaikan keahlian dan otoritas para pakar di berbagai bidang. Buku ini mengajak pembaca untuk memikirkan kembali bagaimana masyarakat saat ini memperlakukan para ahli dan kebenaran ilmiah.");
        buku teknologicopy5 = teknologi5.copy();
        System.out.println("===================================================");
        System.out.println("Daftar Buku Teknologi = ");
        System.out.println("buku 1 = ");
        teknologi1.show();
        System.out.println("buku 2 = ");
        teknologi2.show();
        System.out.println("buku 3 = ");
        teknologi3.show();
        System.out.println("buku 4 = ");
        teknologi4.show();
        System.out.println("buku 5 = ");
        teknologi5.show();

        buku filsafat1 = new buku("Passions of the Soul", "9786236166826", "Renee Descartes", "274",
                " Buku ini berisi diskusi mendalam tentang cara kerja emosi dan tempatnya dalam kehidupan manusia, subjek yang semakin menarik minat para filsuf dan sejarawan intelektual dan budaya. Ini juga menetapkan pandangan etika yang telah dilihat sebagai reorientasi radikal filsafat moral.");
        buku filsafatcopy1 = filsafat1.copy();
        buku filsafat2 = new buku("Madilog", "9786025792403", "Tan Malaka", "560",
                "Buku yang menjelaskan tentang materialisme dialektika dan logika dari bagaimana pandangannya terhadap bangsa Indonesia menghadapi “logika mistika” yang menurut Tan Malaka sendiri adalah fenomena dimana suatu bangsa memandang kejadian-kejadian di dunia ini dipengaruhi oleh kekuatan keramat.");
        buku filsafatcopy2 = filsafat2.copy();
        buku filsafat3 = new buku("Beyond Good and Evil", "9781507764596", "Fredrich Nietszche", "272",
                "Buku yang sangat mendalam tentang kekuatan, gairah, dan cinta individu. Dalam buku ini, Nietzsche menawarkan kepada kita sebuah cara hidup, di mana Kehendak untuk Berkuasa adalah prinsip dasar masyarakat dan individu.");
        buku filsafatcopy3 = filsafat3.copy();
        buku filsafat4 = new buku("A History of God", "9780345384560", "Karen Amstrong", "460",
                "Buku yang membahas tentang sejarah secara deskriptif tentang latar belakang dan awal mula muncu sebuah kepercayaan besar, yakni agama islam, Kristen dan Yahudi.");
        buku filsafatcopy4 = filsafat4.copy();
        buku filsafat5 = new buku("Loving Wounded Soul", "9786020633718", "Regis Machdy", "324",
                "Buku Loving the Wounded Soul membahas tentang depresi secara komprehensif. Mulai dari aspek klinis sampai teori budayanya, faktor internal dan eksternal, serta higher meaning dari kehadiran depresi itu sendiri");
        buku filsafatcopy5 = filsafat5.copy();
        System.out.println("===================================================");
        System.out.println("Daftar Buku Filsafat = ");
        System.out.println("buku 1 = ");
        filsafat1.show();
        System.out.println("buku 2 = ");
        filsafat2.show();
        System.out.println("buku 3 = ");
        filsafat3.show();
        System.out.println("buku 4 = ");
        filsafat4.show();
        System.out.println("buku 5 = ");
        filsafat5.show();

        buku Sejarah1 = new buku("Sejarah Dunia yang Disembunyikan","9786029193671","Jonathan Black","636",
                "Buku ini memberi pembacanya banyak pengetahuan menarik tentang sejarah dunia yang mungkin saja belum banyak diketahui oleh publik. Atau bahkan mungkin saja sengaja memang sengaja disembunyikan oleh pihak-pihak yang tidak ingin sejarah tersebut diketahui oleh banyak orang.");
        buku sejarahcopy1 = Sejarah1.copy();
        buku Sejarah2 = new buku("Sejarah Teh","9786230013201","Laura Martin","226",
                "Buku ini membahas mengenai asal-usul dan sejarah teh di dunia dengan beragam kisahnya yang menarik dan mengagumkan. Selain sebagai minuman yang nikmat dan berkhasiat, teh juga bisa mempengaruhi budaya dan kehidupan suatu bangsa. Bahkan, teh juga mampu berkontribusi terhadap perekonomian suatu negara.");
        buku sejarahcopy2 = Sejarah2.copy();
        buku Sejarah3 = new buku("A History of God","9780345384560","Karen Amstrong","460",
                "Buku yang membahas tentang sejarah secara deskriptif tentang latar belakang dan awal mula muncu sebuah kepercayaan besar, yakni agama islam, Kristen dan Yahudi.");
        buku sejarahcopy3 = Sejarah3.copy();
        buku Sejarah4 = new buku("Homo Deus","786026577337","Yuval Noah Harari","448",
                "Buku “Homo Deus”, Yuval Noah Harari menjelaskan tentang peradaban manusia pada masa saat ini sekaligus peradaban manusia pada 100 tahun sebelumnya. Menurut Yuval Noah Harari, manusia mampu mengatasi tiga buah masalah dalam hidupnya yaitu kelaparan, wabah penyakit hingga kondisi perang pada zaman dahulu.");
        buku sejarahcopy4 = Sejarah4.copy();
        buku Sejarah5 = new buku("Hiroshima","9780593080696","John Hersey","166",
                "Buku tersebut mengisahkan cerita enam korban selamat bom atom yang dijatuhkan di Hiroshima, yang meliputi masa tepat sebelum dan setahun setelah bom atom dijatuhkan pada 6 Agustus 1945.");
        buku sejarahcopy5 = Sejarah5.copy();
        System.out.println("===================================================");
        System.out.println("Daftar Buku Sejarah = ");
        System.out.println("buku 1  ");
        Sejarah1.show();
        System.out.println("buku 2  ");
        Sejarah2.show();
        System.out.println("buku 3  ");
        Sejarah3.show();
        System.out.println("buku 4  ");
        Sejarah4.show();
        System.out.println("buku 5  ");
        Sejarah5.show();

        buku Agama1 = new buku("No God but god","9780099564324","Reza Aslam","320",
                "Buku yang menjelaskan secara detail tentang islam, dari asalm mulanya hingga sejarah sejarah yang ada pada agama islam tersebut");
        buku agamacopy1 = Agama1.copy();
        buku Agama2 = new buku("The Story of Qur'an","9780470673492","Ingrid Mattson","312",
                "Buku yang menceritakan sejarah dari terbentuknya Al-Quran yang kita tahu selama ini sebagai kitab umat muslim di dunia");
        buku agamacopy2 = Agama2.copy();
        buku Agama3 = new buku("Generation M","9786022912606","Shelina Janmohamed","276",
                "Buku yang menjelaskan Generasi M, generasi muda Muslim modern yang keimanannya mempengaruhi gaya hidup. Di dalam buku ini, Anda akan disajikan mengenai perpaduan iman, modernitas, dan identitas Muslim modern dengan cara-cara yang memikat.");
        buku agamacopy3 = Agama3.copy();
        buku Agama4 = new buku("The Great Theft: Wrestling Islam from The Extremes","9787493340694","Khaled Abou El Fadl","277",
                "Buku yang mengambarkan pertentangan antara Islam moderat dan puritan (Salafi/ Wahabi) dengan bahasa populer.  Buku ini mengkritisi secara mendalam pandangan kelompok puritan mengenai teologi dan hukum Islam.");
        buku agamacopy4 = Agama4.copy();
        buku Agama5 = new buku("Muhammad: A Prophet for Our Time","9780739482636","Karen Armstrong","256",
                "Buku yang menceritakan sosok Muhammad, Karen Amstrong menggambarkan Muhammad sebagi sosok yang pemberani, cerdas, dan berbakat sehingga memiliki banyak pengikut yang mempercayainya.");
        buku agamacopy5 = Agama5.copy();
        System.out.println("===================================================");
        System.out.println("Daftar Buku Agama = ");
        System.out.println("buku 1  ");
        Agama1.show();
        System.out.println("buku 2  ");
        Agama2.show();
        System.out.println("buku 3  ");
        Agama3.show();
        System.out.println("buku 4  ");
        Agama4.show();
        System.out.println("buku 5  ");
        Agama5.show();

        buku Psikologi1 = new buku("Atomic habits","9786020633176","James Clear","320",
                "Buku tentang bagaimana mengubah kebiasaan-kebiasaan kita menjadi lebih baik dan tentunya menjadi perubahan yang permanen. James Clear mengajarkan kita untuk mencapai tujuan jangka panjang kita melalui kebiasaan-kebiasaan kecil yang kita lakukan setiap harinya.");
        buku psikologicopy1 = Psikologi1.copy();
        buku Psikologi2 = new buku("The Art of Choosing","9780446504119","Sheena Lyengar","329",
                "Buku ini membahas bagaimana kita membuat pilihan dan bagaimana caranya agar kita bisa mengambil pilihan yang terbaik.");
        buku psikologicopy2 = Psikologi2.copy();
        buku Psikologi3 = new buku("The Emotional Brain","9780684836591","Joseph LeDoux","384",
                "Buku ini memberikan wawasan lebih luas mengenai apa saja yang ada dalam pikiran manusia, bagaimana mereka dapat merasakan emosi dalam berpikir, bagaimana mengendalikannya dan mengontrolnya.");
        buku psikologicopy3 = Psikologi3.copy();
        buku Psikologi4 = new buku("The 5AM Club","9781443460712","Robin Sharma","336",
                "The 5 AM Club (2018) merupakan sebuah buku yang menjelaskan pentingnya memulai aktivitas Anda sejak jam 5 pagi dan memanfaatkan waktu pagi Anda sebaik mungkin. Di dalam buku ini Anda akan mempelajari formula dan cara memaksimalkan waktu pagi Anda sebaik mungkin untuk hidup yang lebih sukses, bahagia dan bermakna seperti para legenda di bidangnya.");
        buku psikologicopy4 = Psikologi4.copy();
        buku Psikologi5 = new buku("The Power Of Habit","9780812981605","Charles Duhigg","370",
                "Buku karya Charles Duhigg “The Power of Habit” ada buku yang akan membawa kita pembacanya dalam pengendalian diri dan merubah pola pikir kita pembacanya ketika kita dihadapi dan menyikapi suatu keadaan. Charles Duhigg akan menjabarkan secara sistematis suatu sikap atau kebiasaan seseorang melalui sebuah kejadian yang akan terkait dalam diri orang tersebut.");
        buku psikologicopy5 = Psikologi5.copy();
        System.out.println("===================================================");
        System.out.println("Daftar Buku Psikologi = ");
        System.out.println("buku 1  ");
        Psikologi1.show();
        System.out.println("buku 2 ");
        Psikologi2.show();
        System.out.println("buku 3  ");
        Psikologi3.show();
        System.out.println("buku 4  ");
        Psikologi4.show();
        System.out.println("buku 5  ");
        Psikologi5.show();

        buku politik1 = new buku("Politik Identitas Kesaktian dan Kekuatan","9789797720254","Otto Sukatno","124",
                "Buku yang menjelaskan tentang identitas suatu kepolitikan negara, dan bagaimana politik dapat memberikan pengaruh dan dampak untuk negara.");
        buku politikcopy1 = politik1.copy();
        buku politik2 = new buku("The Republic","9787513346394","Plato","342",
                "Buku The Republic yang ditulis oleh Plato,berisi tentang keadilan yang memiliki pengertian bahwa seseorang membatasi dirinya pada kerja dan tempat dalam hidup yang sesuai dengan bidangnya atau dengan kata lain bekerja sesuai dengan kemampuannya. Dalam hubungan kenegaraan, keadilan menurut Plato terletak pada adanya keselaran antara fungsi dan kecakapan seseorang dalam suatu bidang.");
        buku politikcopy2 = politik2.copy();
        buku politik3 = new buku("Politik Kuasa Media","9799900964","Noam Chomsky","250",
                "Buku yang memberikan sudut pandang mengenai gelapnya politik dan bagaimana politik menguasai suatu media untuk memberikan dampaknya.");
        buku politikcopy3 = politik3.copy();
        buku politik4 = new buku("Politik dan Kebebasan","9786236421208","Tom Palmer","200",
                "Buku yang memberikan gambaran utuh mengenai politik yang akan menjauhkan diri dari kebebasan, dikarenakan suatu bentuk pengaruh dari politik itu sendiri yang mendorong kita untuk tetap dalam suatu cycle.");
        buku politikcopy4 = politik4.copy();
        buku politik5 = new buku("Politik, Partai Polik, dan Perempuan","9789791260107","Imron Wasi","104",
                "Buku yang membahas keterlibatan perempuan dalam dunia politik, dimana pengaruh perempuan dalam politik dianggap masih kurang karena adanya perspektif yang menganggap perempuan masih belum terlalu berpengaruh dalam kepemimpinan.");
        buku politikcopy5 = politik5.copy();
        System.out.println("===================================================");
        System.out.println("Daftar Buku Politik = ");
        System.out.println("buku 1  ");
        politik1.show();
        System.out.println("buku 2  ");
        politik2.show();
        System.out.println("buku 3  ");
        politik3.show();
        System.out.println("buku 4  ");
        politik4.show();
        System.out.println("buku 5  ");
        politik5.show();

        buku fiksi1 = new buku("The Martian","9780804139021","Andy Weir","369",
                "The Martian berkisah tentang seorang astronaut yang berjuang untuk bertahan hidup di Mars. Si tokoh, Watney, adalah seorang ahli botani yang turut dalam program NASA yang dinamai dengan Ares.");
        buku fiksicopy1 = fiksi1.copy();
        buku fiksi2 = new buku("The Christmas Pig","9787513340694","JK Rowling","320",
                "Novel berjudul The Christmas Pig itu menceritakan rasa hilang dan ditemukan, tentang mencintai dan dicintai, serta apa yang tetap bersama kita dan apa yang hilang.");
        buku fiksicopy2 = fiksi2.copy();
        buku fiksi3 = new buku("Earth","9786020627526","Tere Liye","551",
                "Novel ini mengisahkan tentang petualangan 3 remaja yang berusia 15 tahun bernama Raib, Ali dan Seli. Namun mereka bukanlah remaja biasa, melainkan remaja yang memiliki kekuatan khusus seperti Raib yang bisa menghilang, Seli yang bisa mengeluarkan petir dan Ali seorang pelajar yang sangat jenius.");
        buku fiksicopy3 = fiksi3.copy();
        buku fiksi4 = new buku("The Sea Speak His Name","9789814882316","Leila Chudori","308",
                "Laut Bercerita menceritakan terkait perilaku kekejaman dan kebengisan yang dirasakan oleh kelompok aktivis mahasiswa di masa Orde Baru. Tidak hanya itu, novel ini pun merenungkan kembali akan hilangnya 13 aktivis, bahkan sampai saat ini belum juga ada yang mendapatkan petunjuknya.");
        buku fiksicopy4 = fiksi4.copy();
        buku fiksi5 = new buku("Max Havelaar","9786021637456","Multatuli","396",
                "Buku ini menceritakan pengalaman Max Havelaar, seorang pejabat kolonial Belanda yang idealis di Jawa. Dalam cerita, Havelaar menemukan — dan kemudian memberontak terhadap — sistem tanam paksa yang dikenakan pada petani Indonesia oleh pemerintah Belanda.");
        buku fiksicopy5 = fiksi5.copy();
        System.out.println("===================================================");
        System.out.println("Daftar Buku Fiksi = ");
        System.out.println("buku 1 ");
        fiksi1.show();
        System.out.println("buku 2  ");
        fiksi2.show();
        System.out.println("buku 3  ");
        fiksi3.show();
        System.out.println("buku 4  ");
        fiksi4.show();
        System.out.println("buku 5  ");
        fiksi5.show();

        System.out.println("============Copy Buku============");
        teknologicopy1.show();
        teknologicopy2.show();
        teknologicopy3.show();
        teknologicopy4.show();
        teknologicopy5.show();
        System.out.println("=================================");
        filsafatcopy1.show();
        filsafatcopy2.show();
        filsafatcopy3.show();
        filsafatcopy4.show();
        filsafatcopy5.show();
        System.out.println("=================================");
        sejarahcopy1.show();
        sejarahcopy2.show();
        sejarahcopy3.show();
        sejarahcopy4.show();
        sejarahcopy5.show();
        System.out.println("=================================");
        agamacopy1.show();
        agamacopy2.show();
        agamacopy3.show();
        agamacopy4.show();
        agamacopy5.show();
        System.out.println("=================================");
        psikologicopy1.show();
        psikologicopy2.show();
        psikologicopy3.show();
        psikologicopy4.show();
        psikologicopy5.show();
        System.out.println("=================================");
        politikcopy1.show();
        politikcopy2.show();
        politikcopy3.show();
        politikcopy4.show();
        politikcopy5.show();
        System.out.println("=================================");
        fiksicopy1.show();
        fiksicopy2.show();
        fiksicopy3.show();
        fiksicopy4.show();
        fiksicopy5.show();
    }
}
