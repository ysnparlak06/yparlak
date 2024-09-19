package com.example.application.views.empty;

import com.vaadin.flow.component.accordion.Accordion;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.theme.lumo.LumoUtility;
import org.vaadin.lineawesome.LineAwesomeIcon;

@PageTitle("Yasin Parlak")
@Menu(icon = "line-awesome/svg/file.svg", order = 0)
@Route(value = "")
@RouteAlias(value = "")
public class EmptyView extends VerticalLayout {

    public EmptyView() {
        getStyle().set("padding", "0");
        setSpacing(false);
        setSizeFull();

        Image img = new Image("images/yazilim.jpeg", "background image");
        img.setSizeFull();
        img.getStyle().set("object-fit", "cover");
        img.getStyle().set("position", "relative");

        HorizontalLayout layoutRow = new HorizontalLayout();
        layoutRow.addClassName(LumoUtility.Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        layoutRow.setAlignItems(Alignment.CENTER);
        layoutRow.setJustifyContentMode(JustifyContentMode.END);
        layoutRow.getElement().getStyle().set("padding-right", "50px");

        layoutRow.getStyle().set("position", "absolute");
        layoutRow.getStyle().set("top", "0");
        layoutRow.getStyle().set("z-index", "1");

        Button buttonTertiary = new Button("Hakkımda");
        buttonTertiary.setWidth("min-content");
        buttonTertiary.getElement().getStyle().set("color", "white");
        buttonTertiary.addThemeVariants(ButtonVariant.LUMO_TERTIARY, ButtonVariant.LUMO_LARGE);
        buttonTertiary.addClickListener(e -> {
            HakkimdaDialog dialog = new HakkimdaDialog();
            dialog.open();
        });

        Button buttonTertiary2 = new Button("Yetenekler ve Yetkinlikler");
        buttonTertiary2.setWidth("min-content");
        buttonTertiary2.getElement().getStyle().set("color", "white");
        buttonTertiary2.addThemeVariants(ButtonVariant.LUMO_TERTIARY, ButtonVariant.LUMO_LARGE);
        buttonTertiary2.addClickListener(e -> {
            YetkinlikDialog dialog = new YetkinlikDialog();
            dialog.open();
        });

        Button buttonTertiary3 = new Button("Tecrübe");
        buttonTertiary3.setWidth("min-content");
        buttonTertiary3.getElement().getStyle().set("color", "white");
        buttonTertiary3.addThemeVariants(ButtonVariant.LUMO_TERTIARY, ButtonVariant.LUMO_LARGE);
        buttonTertiary3.addClickListener(e -> {
            TecrubeDialog dialog = new TecrubeDialog();
            dialog.open();
        });

        HorizontalLayout footer = new HorizontalLayout();
        footer.setWidth("auto");
        footer.setSpacing(true);
        footer.setPadding(true);
        footer.getStyle().set("position", "absolute");
        footer.getStyle().set("bottom", "0");
        footer.getStyle().set("right", "0");
        footer.getStyle().set("z-index", "1");

        Anchor aFacebook = new Anchor("https://www.facebook.com/AndBye/", LineAwesomeIcon.FACEBOOK.create());
        aFacebook.setTarget("_blank");
        aFacebook.getElement().setAttribute("title", "Facebook Profilime Git");
        Anchor aLinkedin = new Anchor("https://www.linkedin.com/in/yasin-parlak-51a226112/", LineAwesomeIcon.LINKEDIN.create());
        aLinkedin.setTarget("_blank");
        aLinkedin.getElement().setAttribute("title", "LinkedIn Profilime Git");
        Anchor aInstagram = new Anchor("https://www.instagram.com/yasnparlak/", LineAwesomeIcon.INSTAGRAM.create());
        aInstagram.setTarget("_blank");
        aInstagram.getElement().setAttribute("title", "Instagram Profilime Git");
        Anchor aYoutube = new Anchor("/files/Yasin_Parlak_CV.pdf", LineAwesomeIcon.FILE_DOWNLOAD_SOLID.create());
        aYoutube.setTarget("_blank");
        aYoutube.getElement().setAttribute("download", true);
        aYoutube.getElement().setAttribute("title", "CV Dosyamı İndir");

        aFacebook.getElement().getStyle().set("color", "white");
        aLinkedin.getElement().getStyle().set("color", "white");
        aInstagram.getElement().getStyle().set("color", "white");
        aYoutube.getElement().getStyle().set("color", "white");

        footer.add(aFacebook, aLinkedin, aInstagram, aYoutube);

        layoutRow.add(buttonTertiary);
        layoutRow.add(buttonTertiary2);
        layoutRow.add(buttonTertiary3);

        add(img);
        add(layoutRow);
        add(footer);
    }

    public static class HakkimdaDialog extends Dialog {

        public HakkimdaDialog() {
            Button closeButton = new Button(new Icon(VaadinIcon.CLOSE), event -> close());
            closeButton.addThemeVariants(ButtonVariant.LUMO_TERTIARY);
            closeButton.getStyle().set("position", "absolute");
            closeButton.getStyle().set("top", "10px");
            closeButton.getStyle().set("right", "10px");
            closeButton.getStyle().set("color", "#ff5f57");

            Span name = new Span("Yasin Parlak - Elektrik Elektronik Mühendisi");
            name.getStyle().set("font-weight", "bold");
            name.getStyle().set("font-size", "24px");
            name.getStyle().set("color", "#ffffff");
            name.getStyle().set("margin-bottom", "20px");
            name.getStyle().set("text-align", "center");

            Span line1 = new Span("Gazi Üniversitesi Elektrik Elektronik Mühendisliği bölümünden 2016 yılında mezun oldum ve o günden bu yana çeşitli projelerde ve pozisyonlarda sektörde aktif olarak çalışıyorum. Şu an Bilgi Teknolojileri ve İletişim Kurumu’nda Software Support Specialist olarak görev yapmaktayım. Kariyerim boyunca yazılım geliştirme, ürün yönetimi ve entegrasyon süreçlerinde uzmanlaştım.");
            Span line2 = new Span("2016'dan bu yana, özellikle tüketici şikayet yönetimi, e-Devlet entegrasyonları, yazılım testi ve geliştirme süreçlerinin yanı sıra mobil uygulama geliştirme gibi alanlarda kapsamlı deneyim kazandım. Proje yönetiminden takım liderliğine kadar farklı roller üstlenerek, operasyonel verimlilik ve kullanıcı deneyimini iyileştirme konularında katkı sağlamaya devam ediyorum.");
            Span line3 = new Span("Önceki pozisyonlarımda ise Fonet Bilgi Teknolojileri'nde takım lideri olarak yazılım süreçlerini iyileştirme, mevzuat takibi, raporlama ve süreç otomasyonu gibi alanlarda önemli projelere imza attım. Ayrıca Emcekare Mühendislik'te endüstriyel otomasyon sistemlerinin geliştirilmesi ve güneş enerji santralleri projelerinde PLC tabanlı yazılım çözümleri üzerine çalıştım.");
            Span line4 = new Span("Sürekli gelişimi ve yenilikleri takip etmeyi hedefleyen bir mühendis olarak, sektördeki yenilikçi çözümleri hayata geçirerek maksimum verimlilik sağlamayı amaçlıyorum.");

            line1.getStyle().set("color", "#ffffff");
            line2.getStyle().set("color", "#ffffff");
            line3.getStyle().set("color", "#ffffff");
            line4.getStyle().set("color", "#ffffff");

            VerticalLayout personalInformationLayout = new VerticalLayout(line1, line2, line3, line4);
            personalInformationLayout.setSpacing(true);
            personalInformationLayout.setPadding(true);
            personalInformationLayout.getStyle().set("background-color", "#2c3e50");
            personalInformationLayout.getStyle().set("border-radius", "8px");
            personalInformationLayout.getStyle().set("padding", "20px");
            personalInformationLayout.getStyle().set("box-shadow", "0px 4px 8px rgba(0, 0, 0, 0.2)");

            line1.getStyle().set("margin-bottom", "15px");
            line2.getStyle().set("margin-bottom", "15px");
            line3.getStyle().set("margin-bottom", "15px");
            line4.getStyle().set("margin-bottom", "0");

            add(name, personalInformationLayout);
            add(closeButton);
            getElement().getStyle().set("background-color", "#34495e");
            getElement().getStyle().set("border-radius", "12px");
            getElement().getStyle().set("padding", "20px");

            setWidth("60%");
            setHeight("auto");
            setCloseOnEsc(true);
            setCloseOnOutsideClick(true);
        }
    }


    public static class YetkinlikDialog extends Dialog {

        public YetkinlikDialog() {
            Accordion accordion = new Accordion();
            Button closeButton = new Button(new Icon(VaadinIcon.CLOSE), event -> close());
            closeButton.addThemeVariants(ButtonVariant.LUMO_TERTIARY);
            closeButton.getStyle().set("position", "absolute");
            closeButton.getStyle().set("top", "10px");
            closeButton.getStyle().set("right", "10px");

            if (accordion.getElement().getChildren().findAny().isEmpty()) {

                Span line11 = new Span("Tüketici Şikayet Yönetim Sistemi (TŞYS) liderliği ve entegrasyon.");
                Span line12 = new Span("İhale dosyası hazırlama ve teknik dokümantasyon.");
                VerticalLayout layout1 = new VerticalLayout(line11, line12);
                layout1.setSpacing(false);
                layout1.setPadding(false);
                accordion.add("Proje Yönetimi ve Ürün Geliştirme", layout1);

                Span line21 = new Span("e-Devlet entegrasyonları: KEP, e-İmza, Haberleşme.");
                Span line22 = new Span("Sistem entegrasyonları ve süreç optimizasyonu danışmanlığı.");
                VerticalLayout layout2 = new VerticalLayout(line21, line22);
                layout2.setSpacing(false);
                layout2.setPadding(false);
                accordion.add("Entegrasyon ve İletişim Yönetimi", layout2);

                Span line31 = new Span("Kapsamlı yazılım test süreçleri ve performans analizi.");
                Span line32 = new Span("Yazılım kalite yönetimi ve sorun çözme.");
                VerticalLayout layout3 = new VerticalLayout(line31, line32);
                layout3.setSpacing(false);
                layout3.setPadding(false);
                accordion.add("Yazılım Test ve Geliştirme", layout3);

                Span line41 = new Span("Kullanıcı geri bildirimlerinin analizi ve yazılım geliştirme.");
                Span line42 = new Span("Uygulama performansını artırmaya yönelik iyileştirme.");
                VerticalLayout layout4 = new VerticalLayout(line41, line42);
                layout4.setSpacing(false);
                layout4.setPadding(false);
                accordion.add("Mobil Uygulama Yönetimi", layout4);

                Span line51 = new Span("Süreçlerin analizi ve otomasyon fırsatlarının belirlenmesi.");
                Span line52 = new Span("Mevzuat takibi ve yazılım süreçlerinin güncellenmesi.");
                VerticalLayout layout5 = new VerticalLayout(line51, line52);
                layout5.setSpacing(false);
                layout5.setPadding(false);
                accordion.add("Süreç İyileştirme ve Otomasyon", layout5);

                Span line61 = new Span("Jasper raporlama aracı ile rapor ve barkod tasarımı.");
                Span line62 = new Span("İstatistiksel veri sorgulama ve ara yüz entegrasyonu.");
                VerticalLayout layout6 = new VerticalLayout(line61, line62);
                layout6.setSpacing(false);
                layout6.setPadding(false);
                accordion.add("Tasarım ve Raporlama", layout6);

                Span line71 = new Span("PLC otomasyon yazılımları: Su arıtma ve güneş enerji sistemleri.");
                Span line72 = new Span("Gerçek zamanlı izleme ve müdahale sistemleri.");
                VerticalLayout layout7 = new VerticalLayout(line71, line72);
                layout7.setSpacing(false);
                layout7.setPadding(false);
                accordion.add("Endüstriyel Otomasyon ve PLC Sistemleri", layout7);

                Span line81 = new Span("Sağlık kurumlarında sistem kurulumu ve saha analizleri.");
                Span line82 = new Span("ERP üzerinden sorun raporlama ve çözüm önerileri.");
                VerticalLayout layout8 = new VerticalLayout(line81, line82);
                layout8.setSpacing(false);
                layout8.setPadding(false);
                accordion.add("Sistem Kurulum ve Saha Analizleri", layout8);

                Span line91 = new Span("Kullanıcı ve sistem ihtiyaçlarının analiz edilmesi.");
                Span line92 = new Span("Detaylı dokümantasyon oluşturma ve sistem iyileştirme.");
                VerticalLayout layout9 = new VerticalLayout(line91, line92);
                layout9.setSpacing(false);
                layout9.setPadding(false);
                accordion.add("İhtiyaç Analizi ve Dokümantasyon", layout9);

                add(closeButton, accordion);
            }

            setWidth("75%");
            setHeight("75%");
            setCloseOnEsc(true);
            setCloseOnOutsideClick(true);
        }
    }


    public static class TecrubeDialog extends Dialog {

        public TecrubeDialog() {
            Accordion accordion = new Accordion();
            Button closeButton = new Button(new Icon(VaadinIcon.CLOSE), event -> close());
            closeButton.addThemeVariants(ButtonVariant.LUMO_TERTIARY);
            closeButton.getStyle().set("position", "absolute");
            closeButton.getStyle().set("top", "10px");
            closeButton.getStyle().set("right", "10px");

            if (accordion.getElement().getChildren().findAny().isEmpty()) {
                Span name1 = new Span("Software Support Specialist / Mart 2022 - Günümüz");
                name1.getStyle().set("font-weight", "bold");
                Span line11 = new Span(" - Tüketici Şikayet Yönetim Sistemi (TŞYS) Ürün Geliştirme ve Proje Yönetimi: Şirketimizin TŞYS platformunun kapsamlı ürün geliştirme süreçlerine liderlik ederek, kullanıcı ihtiyaçlarına uygun yenilikçi çözümler üretmekte ve bu sürecin her aşamasında proje yönetimini üstlenmekteyim. Sistemin entegrasyon çalışmalarını koordine ederek, operasyonel verimliliği artırmayı ve kullanıcı deneyimini iyileştirmeyi amaçlıyorum.");
                Span line12 = new Span(" - e-Devlet Entegrasyonları ve İletişim Yönetimi: e-Devlet platformu üzerinden Haberleşme, Kayıtlı Elektronik Posta (KEP) ve Elektronik İmza (e-İmza) konularında, firmalar tarafından tüketicilere sunulan bilgilerin web servis entegrasyonlarını modelleyerek, bu süreçlerin etkin ve sorunsuz bir şekilde işlemesini sağlıyorum. İşletmelere bu süreçlerin optimizasyonunda danışmanlık yaparak, entegrasyon süreçlerini koordine etmekteyim.");
                Span line13 = new Span(" - Yazılım Test ve Geliştirme Süreçleri Analizi: Geliştirilen yazılım programlarının kapsamlı test süreçlerini yürütmekte ve bu süreçlerin performansını değerlendirmekteyim. Yazılım geliştirme süreçlerinin analizini yaparak, yazılım kalitesini artırmaya yönelik stratejiler geliştiriyor ve sorunları hızlı bir şekilde çözmek için gerekli adımları atıyorum.");
                Span line14 = new Span(" - Mobil Uygulama Geri Bildirimleri Yönetimi ve Yazılım Geliştirme: Mobil uygulamalardan gelen kullanıcı geri bildirimlerini analiz ederek, bu geri bildirimlere dayalı olarak yazılım geliştirme çalışmaları yürütüyorum. Uygulama performansını ve kullanıcı memnuniyetini artırmaya yönelik iyileştirme ve güncelleme süreçlerini yöneterek, kullanıcı deneyimini optimize etmekteyim.");

                VerticalLayout personalInformationLayout = new VerticalLayout(name1, line11, line12, line13, line14);
                personalInformationLayout.setSpacing(false);
                personalInformationLayout.setPadding(false);
                accordion.add("Bilgi Teknolojileri ve İletişim Kurumu", personalInformationLayout);


                Span name2 = new Span("Takım Lideri / Mayıs 2019 - Mart 2022");
                name2.getStyle().set("font-weight", "bold");
                Span line21 = new Span(" - Mevzuat Takibi ve Yazılım Süreçleri Desteği: Yayınlanan mevzuat değişikliklerini güncel olarak izleyerek yazılımsal süreçlerin gerekli güncellemelerini ve uyarlamalarını sağlamak.");
                Span line22 = new Span(" - Süreç İyileştirme ve Otomasyon: Mevcut yazılım süreçlerini analiz ederek iyileştirme ve otomasyon fırsatlarını belirlemek, süreçlerin daha verimli hale getirilmesine yönelik çözümler geliştirmek.");
                Span line23 = new Span(" - İhtiyaç Dokümantasyonu ve Tasarım Geliştirme: Kullanıcı ve sistem ihtiyaçlarını tespit ederek detaylı dokümantasyon oluşturmak ve bu ihtiyaçlara uygun tasarımlar geliştirmek.");
                Span line24 = new Span(" - Rapor ve Barkod Tasarımı: Jasper raporlama aracı kullanarak sistemdeki rapor ve barkodları tasarlamak, bu tasarımları sisteme entegre etmek.");
                Span line25 = new Span(" - İstatistik Sorgulama ve Ara Yüz Entegrasyonu: Kurumlar tarafından talep edilen istatistikleri mevcut veri tabanlarından sorgulamak ve bu sorguları kullanıcı ara yüzüne entegre etmek.");
                Span line26 = new Span(" - Saha Analizleri ve Sistem Kurulumları: İl Sağlık Müdürlükleri ve sağlık kurumlarında görevlendirilerek gerekli analizleri yapmak ve sistem kurulum süreçlerini yürütmek.");
                Span line27 = new Span(" - Sorun Analizi ve İletişim: Uygulama yazılımlarındaki sorunları analiz etmek ve bu sorunları ERP programı üzerinden yazılım birimine raporlamak.");
                Span line28 = new Span(" - Kullanıcı ve Sistem İhtiyaçları Dokümantasyonu: Tespit edilen kullanıcı ve sistem ihtiyaçlarını detaylı bir şekilde dokümante etmek, süreçlerin ve sistemlerin iyileştirilmesine katkıda bulunmak.");

                VerticalLayout billingAddressLayout = new VerticalLayout();
                billingAddressLayout.setSpacing(false);
                billingAddressLayout.setPadding(false);
                billingAddressLayout.add(name2, line21, line22, line23, line24, line25, line26, line27, line28);
                accordion.add("Fonet Bilgi Teknolojileri", billingAddressLayout);

                Span name3 = new Span("Elektrik Elektronik Mühendisi / Eylül 2017 - Mayıs 2019");
                name3.getStyle().set("font-weight", "bold");
                Span line31 = new Span(" - Endüstriyel otomasyon, mühendislik ve pano montaj alanlarında, kapsamlı ve yenilikçi çözümler geliştirmek adına, süreçlerin her adımında detaylı analizlerle optimize edilmiş uygulamalar gerçekleştirmek, sektörel standartlara ve müşteri ihtiyaçlarına en uygun sistemleri devreye alarak maksimum verimlilik sağlamaktır. Bu bağlamda, su arıtma tesislerinde kullanılan PLC panolarının otomasyon yazılımlarını hazırlarken, sistemin karmaşık işleyişini çözümleyip her bir bileşeni entegre ederek, suyun her aşamasında yüksek hassasiyetle işlem yapılmasını sağlayan yazılım çözümleri geliştirmek esas alınmaktadır. Özellikle, otomasyon süreçlerinde PLC tabanlı kontrol sistemlerinin devreye alınmasıyla, tesislerin sürdürülebilir bir performans göstermesi, enerji tasarruflarının maksimum düzeye çıkarılması ve arıza oranlarının minimuma indirilmesi hedeflenmektedir.");
                Span line32 = new Span(" - Buna ek olarak, güneş enerji santralleri gibi yenilenebilir enerji kaynaklarını yöneten PLC pano otomasyon sistemlerinin yazılımını geliştirirken, santralin enerji üretim süreçlerini dinamik bir şekilde izleyip, gerektiğinde müdahale edilebilecek esneklikte yazılımlar oluşturmak büyük önem taşımaktadır. Bu sistemlerde, güneşin konumuna, hava koşullarına ve enerji talebine göre optimize edilmiş yazılımlar sayesinde, enerji üretimi maksimum seviyeye çıkartılarak, şebeke ile uyumlu ve sürdürülebilir enerji yönetimi sağlanmaktadır. Her aşamada, gerçek zamanlı izleme, analiz ve müdahale süreçleri, santralin kesintisiz ve verimli çalışması için hayati rol oynamaktadır.");
                Span line33 = new Span(" - Yeni projeler için hazırlanan ihale dosyaları ise, teknik detayları titizlikle içeren, maliyet analizlerinin kapsamlı bir şekilde yapıldığı, projeye özgü çözümler sunan ve tüm mühendislik gereksinimlerini göz önünde bulunduran, detaylı raporlar ve tekliflerle desteklenen dokümanlardan oluşmaktadır. Bu dosyaların hazırlanması sırasında, her bir adımda mühendislik çözümlerinin entegrasyonu, sektördeki yenilikçi teknolojilerle desteklenmiş bir yaklaşımın sunulması ve tüm projelerin baştan sona kadar titizlikle planlanıp yönetileceğinin garantisinin verilmesi esastır. Sonuç olarak, endüstriyel otomasyon sistemlerinden güneş enerji santrallerine kadar uzanan geniş bir yelpazede, mühendislik projelerinin her aşamasında en yüksek standartları yakalayarak, yenilikçi çözümler sunma hedefiyle ihale dosyaları hazırlanmaktadır.");

                VerticalLayout emcekareLayout = new VerticalLayout();
                emcekareLayout.setSpacing(false);
                emcekareLayout.setPadding(false);
                emcekareLayout.add(name3, line31, line32, line33);
                accordion.add("Emcekare Mühendislik", emcekareLayout);

                add(closeButton, accordion);
            }
            setWidth("75%");
            setHeight("75%");
            setCloseOnEsc(true);
            setCloseOnOutsideClick(true);
        }
    }
}
