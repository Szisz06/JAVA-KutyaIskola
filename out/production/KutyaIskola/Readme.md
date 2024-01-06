# Java kutyaiskola  – Mócza Szilvia


 Az elképzelt feladat egy kutyaiskola működését mutatja be. Az alap elképzelés hogy a  tulajdonosok az iskolába több fajta kutyát vihetnek és különböző órak közül választhatnak: Kutyafuttató,  engedelmességi képzés illetve agility és őrző-védő  órák. A kutyusok aktívan (nem fáradtan)  mennek a suliba és minden óra után fáradtan mennek haza. A kutyafuttató csak azt a célt szolgálja hogy a kutyák játszanak egymással és elfáradnak. Az alap engedelmességi képzésen egy alkalom 5%-ot jelent a képzés elvégzésében amint eléri egy kutya a 100%ot az engedelmességi képzést teljesítette. Utána is járhat ilyen jellegű órára (mondjuk gyakorlás céljából) de az már százalékot nem ad. A sima kutyák után az iskola specializálódni fog egyes kutyafajtákra. Például lesznek akita fajtájú kutyák akiknél egy alkalom engedelmességi képzés csak 2,5 %-ot ad mivel nagyon makacs kutyák! Az iskola foglalkozik border collie-kal is akiknél egy alkalom 7,5%-ot jelent mivel gyorsan tanulnak.  Az iskolában végezhető agility képzés is ahol minden órán egy feladatokat tanul a kutya alapméretezzetten. Kutyafajtára specializálódva a border  collie-k nem járhatnak örző védő órákra amíg az akiták agility nem alkalmasak. Illetve a kutyaiskola fogadhat németjuhászokat is akik mind a két órára alkalmasok és az engedelmességi képzésen 1 óra 5% fejlődést jelent. Ha az összes feladatot megtanulta egy képzésből a kutya továbbra is járhat órákra, ebben az esetben előröl kezdi a feladatok tanulását. Feltételezzük hogy egy gazdának egy kutyája van ezért a gazda neve alapján fogjuk bevenni és kiadni a kutyákat. A kutyaiskolában egyszerre 10 kutya fér el  és egyszerre csak egy órát tartanak. illetve az iskola szenvedhet természeti katasztrófát ami azonnali bezárást jelent illetve sajnos a bent lévő kutyák elszöknek. Ugyan azon az órán kivétel nélkül is lehetséges többször részt venni  viszont ha másik órára szeretnénk járatni a kutyusunkat ki kell venni és visszarakni.

## Kutyaiskola program I.


Egy kutyaiskola kutyákat vesz be. Ha részt vesznek egy kutyafuttatón , akkor fáradtak lesznek. A kutyákat a tulajdonosok nevével azonosítja az iskola, ki is lehet venni a kutyákat (név alapján) az iskolából!

### Technikai specifikáció:

Az tömbben tároljuk a kutyákat! Alapértelmezetten 10 kutyát tudunk  befogadni. Nem kell optimalizálni, hogy a kiadott kutya helyére vegyünk be új kutyát, folyamatosan rakjuk a tömbbe a kutyákat! A kiadásnál is csak annyit kell megcsinálni, hogy ne legyen már az a kutya bent a tömbben! Jelezzük, ha megtelt a tömb, de máshogy nem kell foglalkozni ezzel az esettel! A kutya és a kutyaiskola is egy-egy külön osztály a modellben a kutya az alany amit a tulajdonos nevével azonosítanak és kutyaiskola fut metódusában fárasztjuk le őket.

## Kutyaiskola program II.

Az iskolában most már csak engedelmességi képzést lehet csinálni. Illetve az iskola szeretne specializálódni és csak adott fajtájú kutyákat bevenni! Ezen az órán is elfáradnak a kutyusok viszont minden alkalom %-ot tesz a képzéshez. Amint egy kutya eléri a 100%ot a képzést elvégezte! Egy kutya a 100% megszerzése után is járhat ilyen jellegű órákra de az már %-ot nem ad. Minden fajtájú kutya máshogy tanul ezért az iskola által bevehető kutyák és hogy hány %-ot ad egy óra engedelmességi képzés:

Akita: 2,5%

BorderCollie:7,5%

NemetJuhasz: 5%

### Technikai specifikáció:

Az engedelmesség ugyan úgy egy külön metódus a modell kutyaiskolában csak itt a kuyták %-ot kapnak minden óra után ami nem mehet 100% fölé. Ha egy kutya elérte a 100%-ot sikeres vizsgát tett. Egy adott tulajdonos kuytájának tudnia kell saját magáról hogy hány %-on áll a képzéssel. A kutya osztály legyen abstract mert most már sima kutyákat nem veszünk be és az abstract kutya osztályból származzanak a különböző fajtájú kutyák.

## Kutyaiskola program III.

Az iskola szenvedhet természeti katasztrófát, akkor	sajnos minden beadott kutyus elszökik! Az iskola a továbbiakban nem üzemel, nem tud kutyákat bevenni! Az elszökött kutyák kikerülnek a tömbből a gazdák nem tudják már sajnos kivenni őket.

## Kutyaiskola program IV.

A iskola tovább specializálódott, engedelmességi, agility és őrző védő képzésekre! Az agility órákon minden óra egy feladat megtanulásával egyenlő és agility órákra akiták nem járhatnak. A feladatok: „ül”, „fekszik”, „figyel”, „ugrik”, „libikóka”,  „kúszik” és „fordul”. Őrző védő képzésre border collie-k nem járhatnak mivel nem alkalmasak rá. Az őrző védő feladatok: “marad”, “láb mellet”, “fogd”, “ereszd”, “hozd” és “védj”. Az összes feladat megtanulása után a feladatok tanulását újra, elölről lehet kezdeni. Az engedelmességi képzés feladatait nem vesszük ilyen módon figyelembe.

### Technikai specifikáció:

Mindegyik más óra, de a kutyák egyformán elfáradnak. Tehát vagy %-ot szereznek vagy pedig új feladatot tanulnak. Minden óra egy külön metódus a kutyaiskola modellben. A kutyáknak nem kell tudnia megmondani minden egyes feladatot amit tanultak csak azt hogy éppen melyik feladatot tanulták meg utoljára.
