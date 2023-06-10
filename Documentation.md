# Projektrapport Testutmaning Bankkonton

### Cristoffer Östberg

### Beskrivning av projektet
Ett projekt om att testa en banks konto med olika testvariabler, instansierade av JUNIT och dess TDD-miljö. Filen Account.java i folder main är den som testas, mha AccountTest.java i folder test.

### Vad som har gjorts
Ett konto med namnet 'Account' har skapats i root-foldern main, sedan ett likadant Testkonto till den klassen (genom högerklick på klass-namnet i Account.java->Go to->Test->Create New Test) då dyker den, mha Maven-strukturen upp i root-foldern test och relaterad till Account direkt utan större trassel.
Därefter skapades en del olika test-fall man kunde komma på i huvudet (såsom minusvärde på vissa variabler, vad som händer om man försöker ta ut pengar med tillräckligt antal pengar på kontot och inte) en @BeforeEach (Som en Main-GrundArrange, typ) sattes dessutom upp som anger kontots grund-parametrar innan övriga testmetoder. Denna angav saker såsom kontonummer, första initialt grundvärde på kontot, etc.

## Arbetet och dess genomförande
Började strula/krångla lite med lära+få ihop detta med Maven och ny struktur(+tänk) alldeles i början, efter nya instruktioner. Men efter att fått dessa implementerade, samt en tydligare struktur förklarat ifrån både lärare och konsult, så känns det toppenbra och grymt. Och det är nog detta man kanske hade önskat man haft lite mer i början med med inlämningar, tror jag. Nu känns det jättetydligt och man lämnar in projekten i tydlig ordning som är jättelätt att följa av andra med, och fungerar på andras datorer dessutom.

Satte sedan ihop en grund i test-klass och grund i Account med Account, Deposit, Withdraw samt getBalance och getAccountNr vilken var en tydlig del av uppgiftsbeskrivningen att man skulle ha med. Testade lite olika utfall som försökt snickra och komma på som sagt tidigare. Provade sedan lite fram och tillbaka med lite olika kod-skriveri, och allt går ju sällan felfritt och man fastnar på de mest basic sakerna ofta. Såsom att man glömt någon If-sats där och någon return-sak där, + allmän syntax-fel med, såklart, men till slut så! Kommer inte ihåg exakt mer vad jag gjorde/hur jag gjorde då men kommer ihåg strulade lite fram och tillbaka med hur jag skulle få ihop test-casen:n att fungera med de olika metoderna i 'Account' och så att det inte skulle lysa rött och bli fel. Men till slut fungerade det.

### Vad som varit svårt
Att få ihop klasserna så de fungerade helt med test-case:n, skriva mer 'cleant' (men jättebra träning dock, såklart) lära sig skriva koden baklänges (då detta var första uppgiften)

### Beskriv lite olika lösningar du gjort
Gjorde eg. inte så mycket mer lösningar med att få ihop grundstrukturen först (viktigt, tror jag, att börja i rätt ände ofta) sedan skapade klasserna med korrekt namn enligt uppg.beskrivning. Testade lite olika lösningar i test-klassen, försökte få det att pussla ihop med huvud-Accountklassen och sedan fungerade det. Tur att det inte var ett större projekt/testa ett helt program iallafall. Puh.

### Beskriv något som var besvärligt att få till
Få Account+AccountTest att passa ihop helt utan fel. Skriva koden baklänges.

### Beskriv om du fått byta lösning och varför i sådana fall
Kommer inte på någon specifik just nu. Fick lägga till If- iallafall (enligt instruktion) för att få det att fungera.

## Slutsatser

### Vad gick bra
Få ihop projektet enligt grundplan, med Maven/test-folderstruktur etc. Pom.xml är ju jättebra nu när man väl lärt sig det.

### Vad gick dåligt
Som ovan nämnt tidigare, få Account+AccountTest att fungera helt utan olika röd-skrikande testutfall. Lära sig tänka ännu 'simplare' än man tidigare gjort (men ändå samtidigt lära sig sjukt mycket att även den enklaste och simplaste biten kod kan göra+utföra så himla mycket i just ett program ändå!)

### Vad har du lärt dig
Skriva simplare kod. Den simplare koden behöver inte vara dålig, den kan tvärtom vara svinbra för att göra sig själv mer förstådd samt andra som skall förstå sig på den sedan. :) Gör ännu mer UtvecklarUX kan man nog kalla det.

### Vad hade ni gjort annorlunda om ni gjort om projektet
Inte mycket, om jag ska vara ärlig. Började med grund, få till den först så jag hade någonting stadigt att stå på. Sedan fortsatte bygga vidare på Marcus sedan tidigare givna instruktioner och läro-saker ifrån klasserna.

### Vilka möjligheter ser du med de kunskaper du fått under kursen.
Det var ganska roligt. Man fick arbeta lite 'Baklänges'. och hålla det kort och enkelt, och göra koden så läsbar det bara gick. Och det var/är roligt, och känns jättebra för mig själv då jag tror/vet att just UI/UX är en ganska stor del för mig själv. Det handlar om att göra saker förstådda inte bara för mig själv, utan för minst fler och många andra. Kindness/Snällhet är en stor sak för mig generellt, och att vara ned på jorden och hjälpande. Och jag tror att detta speglar sig i koden med, att jag vill göra saker inte bara för mig själv. Det är så tråkigt.
