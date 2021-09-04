import java.util.Scanner;
public class FlightBook
{
int acchk=0,log=0,flightbooked=0;
String hr="************************************************************************************************************************";
String uname=null,password=null;
public static void main()//Main Method
{
Scanner s=new Scanner(System.in);
FlightBook fb=new FlightBook();
String loop="on";
 System.out.println("************WELCOME TO BELLWEATHER FLIGHT BOOKING APPLICATION************");
 while(loop.equals("on"))
 {
    System.out.println("                    What would you like to do?");
    System.out.println("******************************************************************************************************");
    System.out.println("Press-(1)-To see Available Locations                 (2)-To Check Availabilty of Flights");
    System.out.println("      (3)-To Book or Cancel Flights                  (4)-To Convert Currencies");
    System.out.println("      (5)-To Log IN or Log OUT                       (6)-To Create Your Bellweather Account");
    System.out.println("      (7)-To see Flight Ticket Cost                  (8)-About Bellweather Application");
    System.out.println("      (9)-To see India's Best Tourist Spots          (0)-To Exit the Application");
    int option=s.nextInt();
    switch(option)
    {
        case 1:
        System.out.println("******************************************************************************************************");
        fb.availloc();
        break;
        case 2:
        System.out.println("******************************************************************************************************");
        fb.availflgt();
        break;
        case 3:
        System.out.println("******************************************************************************************************");
        fb.book();
        break;
        case 4:
        System.out.println("******************************************************************************************************");
        fb.convertCurrency();
        break;
        case 5:
        System.out.println("******************************************************************************************************");
        fb.log();
        break;
        case 6:
        System.out.println("******************************************************************************************************");
        fb.createAccount();
        break;
        case 7:
        System.out.println("******************************************************************************************************");
        fb.TicketPrice();
        break;
        case 8:
        System.out.println("******************************************************************************************************");
        System.out.println("BELLWEATHER Java Application 2017\nVersion:1.0\nDeveloped By Yash Kumar Verma And Lalit Mohan");//8th Module:To display 
        System.out.println("Headquarters: R.C.F Township, Kapurthala, Punjab (India)");                         //Developer details      
        System.out.println("Copyright: Copyright (c) Bellweather");
        break;
        case 9:
        System.out.println("******************************************************************************************************");
        fb.IndiaTouristSpots();
        break;
        case 0:
        loop="off";
        break;
        default:
        System.out.println("Wrong Option! Please try again choosing a correct option!");
    }
}
System.out.println("******************************************************************************************************");
System.out.println("Session Expired...\nThank You For Using Bellweather Flight Booking Java Application!\nHave a Good Day!");
}
void availloc()//1st Module:To see Available locations 
{
Scanner s1=new Scanner(System.in);
System.out.println("Select Type of Locations...");
String loop="yes";
while(loop.equalsIgnoreCase("yes"))
{
System.out.println("Press-(1)-National Locations ........(2)-International Locations");
int x=s1.nextInt();
switch(x)
{
    case 1:
    System.out.println(hr);
    System.out.println("Ahmedabad(AMD)      Amritsar(ATQ)   Bengaluru(BLR)");
    System.out.println("Chandigarh(IXC)     Chennai(MAA)    Dehradun(DED)");
    System.out.println("Delhi(DEL)          Goa(GOI)        Guwahati(GAU)");
    System.out.println("Hyderabad(HYD)      Jaipur(JAI)     Kochi(COK)");
    System.out.println("Kolkata(CCU)        Mumbai(BOM)     Patna(PAT)");
    System.out.println("Port Blair(IXZ)     Pune(PNQ)       Srinagar(SXR)");
    System.out.println("Vishakhapatnam(VTZ) Coimbatore(CJB) Jabalpur(JLR)");
    System.out.println(hr);
    System.out.println("Do you want to continue seeing available locations?(yes/no)");
    loop=s1.next();
    break;
    case 2:
    System.out.println(hr);
    System.out.println("Bangkok(BKK)       Dubai(DXB)      Berlin(TXL)");
    System.out.println("New York(JFK)      London(LHR)     Delhi(DEL)");
    System.out.println("Shanghai(PVG)      Paris(CDG)      Zurich(ZRH)");
    System.out.println("Toronto(YYZ)       Cape Town(CPT)");
    System.out.println(hr);
    System.out.println("Do you want to continue seeing available locations?(yes/no)");
    loop=s1.next();
    break;
    default:
    System.out.println("Wrong Option! Please try again choosing a correct option!");
}
}
}
void availflgt()//2nd Module:To check flight Availability
{
Scanner s2=new Scanner(System.in);
FlightBook fb2=new FlightBook();
String loop="yes";
System.out.println("Flight Availability Check...");
while(loop.equalsIgnoreCase("yes"))
{
System.out.println("Press-(1)-Domestic Flights.......(2)-International Flights");
System.out.println(hr);
int x=s2.nextInt();
switch(x)
{
    case 1://Domestic
   { int subloop1=1,subloop2=1,subloop3=1,subloop4=1,subloop5=1,iloop=1;
    int dpn=0,apn=0,airl=0,date=0,month=0,tifl=0;
    String aps,dps,ms,airline,fln,fs=null,td=null;
    boolean fstatus;
    while(iloop==1)
 {
    while(subloop1==1)
   {
    System.out.println("Select Departure City by pressing the corresponding number...");
    System.out.println("(0)-Ahmedabad(AMD)       (1)-Amritsar(ATQ)    (2)-Bengaluru(BLR)");
    System.out.println("(3)-Chandigarh(IXC)      (4)-Chennai(MAA)     (5)-Dehradun(DED)");
    System.out.println("(6)-Delhi(DEL)           (7)-Goa(GOI)         (8)-Guwahati(GAU)");
    System.out.println("(9)-Hyderabad(HYD)       (10)-Jaipur(JAI)     (11)-Kochi(COK)");
    System.out.println("(12)-Kolkata(CCU)        (13)-Mumbai(BOM)     (14)-Patna(PAT)");
    System.out.println("(15)-Port Blair(IXZ)     (16)-Pune(PNQ)       (17)-Srinagar(SXR)");
    System.out.println("(18)-Vishakhapatnam(VTZ) (19)-Coimbatore(CJB) (20)-Jabalpur(JLR)");
    dpn=s2.nextInt();
    if(dpn<0||dpn>20)
    {System.out.println("Wrong Option! Please try again choosing a correct option!");continue;}
    subloop1=0;
   }
    while(subloop2==1)
    {
   System.out.println("Select Arrival City by pressing the corresponding number...");
    System.out.println("(0)-Ahmedabad(AMD)       (1)-Amritsar(ATQ)    (2)-Bengaluru(BLR)");
    System.out.println("(3)-Chandigarh(IXC)      (4)-Chennai(MAA)     (5)-Dehradun(DED)");
    System.out.println("(6)-Delhi(DEL)           (7)-Goa(GOI)         (8)-Guwahati(GAU)");
    System.out.println("(9)-Hyderabad(HYD)       (10)-Jaipur(JAI)     (11)-Kochi(COK)");
    System.out.println("(12)-Kolkata(CCU)        (13)-Mumbai(BOM)     (14)-Patna(PAT)");
    System.out.println("(15)-Port Blair(IXZ)     (16)-Pune(PNQ)       (17)-Srinagar(SXR)");
    System.out.println("(18)-Vishakhapatnam(VTZ) (19)-Coimbatore(CJB) (20)-Jabalpur(JLR)");
    apn=s2.nextInt();
    if(apn<0||apn>20)
    {System.out.println("Wrong Option! Please try again choosing a correct option!");continue;}
    subloop2=0;
    }
    if(dpn==apn)
    {System.out.println("Departure and Arrival Cities Cannot be Same! Please Try Again");continue;}
    iloop=0;
}
    aps=fb2.numtostr(apn,"dcity");
    dps=fb2.numtostr(dpn,"dcity");
   while(subloop3==1) {
    System.out.println("Enter Date of Departure");
    date=s2.nextInt();
    System.out.println("Enter Month(in number)");
    month=s2.nextInt();
    if((month==4||month==6||month==9||month==11)&&date>30){System.out.println("This month does not have more than 30 days!");continue;}
    if(month==2&&date>29){System.out.println("February does not have more than 29 days!");continue;}
    if(date<1||date>31){System.out.println("Wrong date entered!");continue;}
    if(month<1||month>12){System.out.println("Wrong Month Entered!");continue;}
    subloop3=0;
}
ms=fb2.numtostr(month,"month");
while(subloop4==1)
{
System.out.println("Select the Airline...");
System.out.println("(1)-Air India  (2)-SpiceJet  (3)-IndiGo  (4)-Jet Airways  (5)-GoAir  (6)-Vistara");
airl=s2.nextInt();
if(airl<1||airl>6){System.out.println("Wrong Choice!Please Choose Again!");continue;}
subloop4=0;
}
System.out.println("Time of Flight...");
while(subloop5==1){
System.out.println("(1)-Flight At Night  (2)-Flight At Day");
tifl=s2.nextInt();if(tifl<1||tifl>2){System.out.println("Wrong Choice! Please choose the correct option!");continue;}
subloop5=0;
}
if(tifl==1){td="At night";}if(tifl==2){td="At day";}
airline=fb2.numtostr(airl,"airline");
fln=fltngen(airl,date,month,tifl);
fstatus=fb2.flachk(date,month,tifl);
if(fstatus==true){fs="Flight is Available!";}else{fs="Sorry but the flight is not available!";}
System.out.println(hr);
System.out.println("From: "+dps+"          "+"To: "+aps);
System.out.println("Date of departure: "+date+" "+ms);
System.out.println("Time of departure: "+td);
System.out.println("Airline: "+airline);
System.out.println("Status: "+fs);
if(fstatus==true){System.out.println("Flight Number: "+fln);}
System.out.println(hr);
System.out.println("Do you want to check again the availability of flights?(yes/no)");
loop=s2.next();
}
    break;
    case 2://International 
     { int subloop1=1,subloop2=1,subloop3=1,subloop4=1,subloop5=1,iloop=1;
    int dpn=0,apn=0,airl=0,date=0,month=0,tifl=0;
    String aps,dps,ms,airline,fln,fs=null,td=null;
    boolean fstatus;
    while(iloop==1)
 {
    while(subloop1==1)
   {
    System.out.println("Select Departure City by pressing the corresponding number...");
    System.out.println("(0)-Bangkok(BKK)       (1)-Dubai(DXB)      (2)-Berlin(TXL)");
    System.out.println("(3)-New York(JFK)      (4)-London(LHR)     (5)-Delhi(DEL)");
    System.out.println("(6)-Shanghai(PVG)      (7)-Paris(CDG)      (8)-Zurich(ZRH)");
    System.out.println("(9)-Toronto(YYZ)       (10)-Cape Town(CPT)");
    dpn=s2.nextInt();
    if(dpn<0||dpn>10)
    {System.out.println("Wrong Option! Please try again choosing a correct option!");continue;}
    subloop1=0;
   }
    while(subloop2==1)
    {
   System.out.println("Select Arrival City by pressing the corresponding number...");
    System.out.println("(0)-Bangkok(BKK)       (1)-Dubai(DXB)      (2)-Berlin(TXL)");
    System.out.println("(3)-New York(JFK)      (4)-London(LHR)     (5)-Delhi(DEL)");
    System.out.println("(6)-Shanghai(PVG)      (7)-Paris(CDG)      (8)-Zurich(ZRH)");
    System.out.println("(9)-Toronto(YYZ)       (10)-Cape Town(CPT)");
    apn=s2.nextInt();
    if(apn<0||apn>10)
    {System.out.println("Wrong Option! Please try again choosing a correct option!");continue;}
    subloop2=0;
    }
    if(dpn==apn)
    {System.out.println("Departure and Arrival Cities Cannot be Same! Please Try Again");continue;}
    iloop=0;
}
    aps=fb2.numtostr(apn,"icity");
    dps=fb2.numtostr(dpn,"icity");
   while(subloop3==1) {
    System.out.println("Enter Date of Departure");
    date=s2.nextInt();
    System.out.println("Enter Month(in number)");
    month=s2.nextInt();
    if((month==4||month==6||month==9||month==11)&&date>30){System.out.println("This month does not have more than 30 days!");continue;}
    if(month==2&&date>29){System.out.println("February does not have more than 29 days!");continue;}
    if(date<1||date>31){System.out.println("Wrong date entered!");continue;}
    if(month<1||month>12){System.out.println("Wrong Month Entered!");continue;}
    subloop3=0;
}
ms=fb2.numtostr(month,"month");
while(subloop4==1)
{
System.out.println("Select the Airline...");
System.out.println("(1)-Air India  (2)-SpiceJet  (3)-IndiGo  (4)-Jet Airways  (5)-GoAir  (6)-Vistara (7)-Foreign Country Airline");
airl=s2.nextInt();
if(airl<1||airl>7){System.out.println("Wrong Choice!Please Choose Again!");continue;}
subloop4=0;
}
System.out.println("Time of Flight...");
while(subloop5==1){
System.out.println("(1)-Flight At Night  (2)-Flight At Day");
tifl=s2.nextInt();if(tifl<1||tifl>2){System.out.println("Wrong Choice! Please choose the correct option!");continue;}
subloop5=0;
}
if(tifl==1){td="At night";}if(tifl==2){td="At day";}
airline=fb2.numtostr(airl,"airline");
fln=ifltngen(airl,date,month,tifl);
fstatus=fb2.flachk(date,month,tifl);
if(fstatus==true){fs="Flight is Available!";}else{fs="Sorry but the flight is not available!";}
System.out.println(hr);
System.out.println("From: "+dps+"          "+"To: "+aps);
System.out.println("Country of departure: "+(fb2.numtostr(dpn,"nat")));
System.out.println("Country of arrival: "+(fb2.numtostr(apn,"nat")));
System.out.println("Date of departure: "+date+" "+ms);
System.out.println("Time of departure: "+td);
System.out.println("Airline: "+airline);
System.out.println("Status: "+fs);
if(fstatus==true){System.out.println("Flight Number: "+fln);}
if(fstatus==true&&(dpn!=5&&apn!=5)){System.out.println("No direct route available! Change of aircraft at Delhi!");}
System.out.println(hr);
System.out.println("Do you want to check again the availability of flights?(yes/no)");
loop=s2.next();
}
    break;
    default:
    System.out.println("Wrong Option! Please try again choosing a correct option!");
}
}
}
String numtostr(int o,String uid)//Method to convert choice no. to corresponding string
{
String r=null;
String dc[]={"Ahmedabad(AMD)","Amritsar(ATQ)","Bengaluru(BLR)","Chandigarh(IXC)","Chennai(MAA)","Dehradun(DED)","Delhi(DEL)","Goa(GOI)",
             "Guwahati(GAU)","Hyderabad(HYD)","Jaipur(JAI)","Kochi(COK)","Kolkata(CCU)","Mumbai(BOM)","Patna(PAT)","Port Blair(IXZ)",
             "Pune(PNQ)","Srinagar(SXR)","Vishakhapatnam(VTZ)","Coimbatore(CJB)","Jabalpur(JLR)"};
String ic[]={"Bangkok(BKK)","Dubai(DXB)","Berlin(TXL)","New York(JFK)","London(LHR)","Delhi(DEL)","Shanghai(PVG)",
             "Paris(CDG)","Zurich(ZRH)","Toronto(YYZ)","Cape Town(CPT)"};
String count[]={"Thailand","United Arab Emirates(UAE)","Germany","United States Of America(USA)","United Kingdom(UK)","India",
                 "China","France","Switzerland","Canada","South Africa"};             
String m[]={"null","January","February","March","April","May","June","July","August","September","October","November","December"};  
String air[]={"null","Air India","SpiceJet","IndiGo","Jet Airways","GoAir","Vistara","Foreign Airline"};         
if(uid.equals("dcity")){r=dc[o];}
if(uid.equals("icity")){r=ic[o];}
if(uid.equals("month")){r=m[o];}
if(uid.equals("airline")){r=air[o];}
if(uid.equals("nat")){r=count[o];}
return r;
}
String fltngen(int aero,int dat,int mon,int tod)//Method to generate Flight No. for Domestic flights
{
String pref=null,suff=null,fin=null;
int a=0,b=0;
String p[]={"null","AI","SG","IG","JA","GA","VT"};
pref=p[aero];
a=dat+mon+tod;
if(mon>0&&mon<4){b=100+a;}
if(mon>3&&mon<7){b=400+a;}
if(mon>6&&mon<10){b=700+a;}
if(mon>9&&mon<13){b=900+a;}
suff=Integer.toString(b);
fin=pref+" "+suff;
return fin;
}
String ifltngen(int aero,int dat,int mon,int tod)//Method to generate Flight No. for International flights
{
String pref=null,suff=null,fin=null;
int a=0,b=0;
String p[]={"null","AI","SG","IG","JA","GA","VT","IA"};
pref=p[aero];
a=dat+mon+tod;
if(mon>0&&mon<4){b=1000+a;}
if(mon>3&&mon<7){b=2000+a;}
if(mon>6&&mon<10){b=5000+a;}
if(mon>9&&mon<13){b=8000+a;}
suff=Integer.toString(b);
fin=pref+" "+suff;
return fin;
}
boolean flachk(int dat,int mon,int tod)//Method to check flight availability 
{
int a=dat+mon+tod;
boolean b=(a%2)==0;
return b;
}
void book()//3rd Module:To Book or Cancel Flights 
{
System.out.println("Bellweather Flight Booking...");
Scanner s3=new Scanner(System.in);
FlightBook fb3=new FlightBook();
if(log==0){System.out.println("You haven't logged In! You need to log in before you can book a flight!");}
else
{
  String loop="yes";
  while(loop.equalsIgnoreCase("yes"))
  {
  System.out.println("Press:-(1)-Book Domestic Flight  (2)-Book International Flight  (3)-Cancel Flight");
  int x=s3.nextInt();
  switch(x)
  {
  case 1://Domestic Flights Booking
  {
      if(flightbooked==1)
{System.out.println("Sorry but you can book only 1 one way or round trip flight per account!");continue;}
    String xloop="ok";
while(xloop.equalsIgnoreCase("ok"))
{
System.out.println("======================================================================================================");
System.out.println("---↓   ");                               
System.out.println("Flights........................Passenger details..................Summary......................Payment");
System.out.println("======================================================================================================");
System.out.println("Flight Details...");
int toj=0,sub=0,sub2=0,asub=0,dpc=0,apc=0,date=0,month=0,date2=0,month2=0,tod=0,tod2=0;
while(sub==0)
{System.out.println("Select type of journey...\nPress:-(1)-Round Trip  (2)-One Way");
toj=s3.nextInt();if(toj<1||toj>2){System.out.println("Wrong choice! Please Choose Again!");continue;}sub=1;
}
while(sub==1)
{
while(sub2==0){  
System.out.println("Select Departure City by pressing the corresponding number...");
System.out.println("(0)-Ahmedabad(AMD)       (1)-Amritsar(ATQ)    (2)-Bengaluru(BLR)");
System.out.println("(3)-Chandigarh(IXC)      (4)-Chennai(MAA)     (5)-Dehradun(DED)");
System.out.println("(6)-Delhi(DEL)           (7)-Goa(GOI)         (8)-Guwahati(GAU)");
System.out.println("(9)-Hyderabad(HYD)       (10)-Jaipur(JAI)     (11)-Kochi(COK)");
System.out.println("(12)-Kolkata(CCU)        (13)-Mumbai(BOM)     (14)-Patna(PAT)");
System.out.println("(15)-Port Blair(IXZ)     (16)-Pune(PNQ)       (17)-Srinagar(SXR)");
System.out.println("(18)-Vishakhapatnam(VTZ) (19)-Coimbatore(CJB) (20)-Jabalpur(JLR)");
dpc=s3.nextInt();  if(dpc<0||dpc>20){System.out.println("Wrong Option selected! Please try again!");continue;}
sub2=1;
}
while(sub2==1){
System.out.println("Select Arrival City by pressing the corresponding number...");
System.out.println("(0)-Ahmedabad(AMD)       (1)-Amritsar(ATQ)    (2)-Bengaluru(BLR)");
System.out.println("(3)-Chandigarh(IXC)      (4)-Chennai(MAA)     (5)-Dehradun(DED)");
System.out.println("(6)-Delhi(DEL)           (7)-Goa(GOI)         (8)-Guwahati(GAU)");
System.out.println("(9)-Hyderabad(HYD)       (10)-Jaipur(JAI)     (11)-Kochi(COK)");
System.out.println("(12)-Kolkata(CCU)        (13)-Mumbai(BOM)     (14)-Patna(PAT)");
System.out.println("(15)-Port Blair(IXZ)     (16)-Pune(PNQ)       (17)-Srinagar(SXR)");
System.out.println("(18)-Vishakhapatnam(VTZ) (19)-Coimbatore(CJB) (20)-Jabalpur(JLR)");
apc=s3.nextInt();if(apc<0||apc>20){System.out.println("Wrong Option selected! Please try again!");continue;}
sub2=2;}
if(dpc==apc){System.out.println("Departure and Arrival Cities cannot be same! Please try again!");continue;}
sub=2;
}
while(sub==2){
System.out.println("Enter Departure date...");
date=s3.nextInt();
System.out.println("Enter month...");
month=s3.nextInt();
if((month==4||month==6||month==9||month==11)&&date>30){System.out.println("This month does not have more than 30 days!");continue;}
if(month==2&&date>29){System.out.println("February does not have more than 29 days!");continue;}
if(date<1||date>31){System.out.println("Wrong date entered!");continue;}
if(month<1||month>12){System.out.println("Wrong Month Entered!");continue;}
sub=3;
}
System.out.println("Time of Flight...");
while(sub==3){
System.out.println("(1)-Flight At Night  (2)-Flight At Day");
tod=s3.nextInt();if(tod<1||tod>2){System.out.println("Wrong Choice! Please choose the correct option!");continue;}
sub=4;
}
if(toj==1)
{
while(asub==0){
System.out.println("Enter Return date...");
date2=s3.nextInt();
System.out.println("Enter month...");
month2=s3.nextInt();  
if((month==4||month==6||month==9||month==11)&&date>30){System.out.println("This month does not have more than 30 days!");continue;}
if(month==2&&date>29){System.out.println("February does not have more than 29 days!");continue;}
if(date<1||date>31){System.out.println("Wrong date entered!");continue;}
if(month<1||month>12){System.out.println("Wrong Month Entered!");continue;}
asub=1;
}
}
if(toj==1)
{
System.out.println("Return Time of Flight...");
while(asub==1){
System.out.println("(1)-Flight At Night  (2)-Flight At Day");
tod2=s3.nextInt();if(tod2<1||tod2>2){System.out.println("Wrong Choice! Please choose the correct option!");continue;}
asub=2;
}
}
boolean flcheck,flcheck2=false;
flcheck=fb3.flachk(date,month,tod);
flcheck2=fb3.flachk(date2,month2,tod2);
int airl=0;
while(sub==4)
{
System.out.println("Select the Airline...");
System.out.println("(1)-Air India  (2)-SpiceJet  (3)-IndiGo  (4)-Jet Airways  (5)-GoAir  (6)-Vistara");
airl=s3.nextInt();
if(airl<1||airl>6){System.out.println("Wrong Choice! Please Choose Again!");continue;}
sub=5;
}
int clas=0;
while(sub==5){
System.out.println("Select class...\nPress-(1)-Economic  (2)-Business  (3)-First");
clas=s3.nextInt();if(clas<1||clas>3){System.out.println("Wrong Option selected! Please try again!");continue; }
sub=6;
}
System.out.println("*********************************************************************************************");
long dprice[]={1000,500,1200,2000,2500,3000,500,1500,3000,1000,700,1000,1700,2000,1300,3500,2000,3000,1500,1000,1000};
long aprice[]={4000,4000,8000,5000,10000,6000,2000,10000,12000,3000,5000,2000,7000,8000,4000,15000,5000,6000,5000,4000,2500};
long discount[]={500,1000,800,750,650,400,700,200,100,350,900,1100,1500,2000,1300,1200,1600,1800};
String classs[]={"null","Economic","Business","First"};
String fln,fln2,air,time,time2,mon,mon2,dc,ac;
fln=fb3.fltngen(airl,date,month,tod);fln2=fb3.fltngen(airl,date2,month2,tod2);
air=fb3.numtostr(airl,"airline");
time=(tod==1)? "Flight At Night":"Flight At Day";
time2=(tod2==1)?"Flight At Night":"Flight At Day";
mon=fb3.numtostr(month,"month");
mon2=fb3.numtostr(month2,"month");
dc=fb3.numtostr(dpc,"dcity");
ac=fb3.numtostr(apc,"dcity");
String fstat=(flcheck==true)? "Flight is Available!":"Sorry but the flight is not available!";
String fstat2=(flcheck2==true)? "Flight is Available!":"Sorry but the flight is not available!";
long owc=dprice[dpc]+aprice[apc];
long rwc=dprice[apc]+aprice[dpc];
long cost=clas*owc;
long cost2=clas*rwc;
String tof=(toj==1)? "Round Trip":"One Way";
System.out.println("Flight Status...");
System.out.println("Type of Flight: "+tof);
System.out.println("FROM: "+dc+"                TO: "+ac);
System.out.println("Date of Departure: "+date+" "+mon);
System.out.println("Time of Flight: "+time);
System.out.println("Airline: "+air);
System.out.println("Class: "+classs[clas]);
System.out.println("Flight Status: "+fstat);
if(flcheck==true){System.out.println("Flight Number: "+fln);}
if(flcheck==true){System.out.println("Flight Cost(per adult): Rs."+cost);}
if(toj==1){System.out.println("****************************************************************************************************");
System.out.println("Return Flight status...");
System.out.println("FROM: "+ac+"                TO: "+dc);
System.out.println("Date of Return: "+date2+" "+mon2);
System.out.println("Time of Return Flight: "+time2);
System.out.println("Airline: "+air);
System.out.println("Class: "+classs[clas]);
if(flcheck==false)
{System.out.println("Return Flight Status: Sorry but the flight is not available!");}
else
{System.out.println("Return Flight Status: "+fstat2);
if(flcheck2==true){System.out.println("Return Flight Number: "+fln2);System.out.println("Return Flight Cost(per adult): Rs."+cost2);}
}
}
if(flcheck==false){break;}
System.out.println("Enter OK to continue booking or CANCEL to cancel flight booking and go back!");
xloop=s3.next();
if((xloop.equalsIgnoreCase("ok"))==false){break;}
System.out.println("======================================================================================================");
System.out.println("---✓-----------------------------------↓   ");                               
System.out.println("Flights........................Passenger details..................Summary......................Payment");
System.out.println("======================================================================================================");
System.out.println("Passenger details...");
int ad=0,cd=0,inf=0;
while(sub==6){
System.out.println("Enter number of adults..."); 
ad=s3.nextInt(); 
if(ad<1){System.out.println("Atleast one adult is required to accompany any junior passenger!");continue;}
if(ad>10){System.out.println("You can buy tickets for only 10 adults per account!");continue;}
sub=7;
}
while(sub==7){
System.out.println("Enter number of children...");
cd=s3.nextInt();if(cd>5){System.out.println("You can buy tickets for only 5 children per account!");continue;} 
sub=8;}
while(sub==8){
System.out.println("Enter number of infants...");
inf=s3.nextInt();if(inf>5){System.out.println("You can buy tickets for only 5 infants per account!");continue;}
sub=9;}
System.out.println("Enter Adult details...");
String adultsFirstName[]=new String[10];
String adultsLastName[]=new String[10];
char ag[]=new char[10];
for(int i=0;i<ad;i++)
{
System.out.println("Adult No. "+(i+1));
System.out.println("Gender:-(M)-Male   (F)-Female");
ag[i]=s3.next().charAt(0);
System.out.println("Enter First Name...");
adultsFirstName[i]=s3.next();
System.out.println("Enter Last Name...");
adultsLastName[i]=s3.next();
}
String childFirstName[]=new String[5];
String childLastName[]=new String[5];
char cg[]=new char[5];
for(int i=0;i<cd;i++)
{
System.out.println("Child No. "+(i+1));
System.out.println("Gender:-(M)-Male   (F)-Female");
cg[i]=s3.next().charAt(0);
System.out.println("Enter First Name...");
childFirstName[i]=s3.next();
System.out.println("Enter Last Name...");
childLastName[i]=s3.next();
}
String infantFirstName[]=new String[5];
String infantLastName[]=new String[5];
char ig[]=new char[5];
String dob[]=new String[5];
for(int i=0;i<inf;i++)
{
System.out.println("Infant No. "+(i+1));
System.out.println("Gender:-(M)-Male   (F)-Female");
cg[i]=s3.next().charAt(0);
System.out.println("Enter First Name...");
childFirstName[i]=s3.next();
System.out.println("Enter Last Name...");
childLastName[i]=s3.next();
System.out.println("Enter Date of Birth...(dd-mm-yyyy format)");
dob[i]=s3.next();
}
String fname,lname,eid,mob,country,city;
System.out.println("Enter contact details...");
System.out.println("Enter First Name...");
fname=s3.next();
System.out.println("Enter Last Name");
lname=s3.next();
System.out.println("Enter Email ID");
eid=s3.next();
System.out.println("Enter Mobile No.");
mob=s3.next();
System.out.println("Enter Country");
country=s3.next();
System.out.println("Enter City");
city=s3.next();
System.out.println("Enter OK to continue booking or CANCEL to cancel flight booking and go back!");
xloop=s3.next();
if((xloop.equalsIgnoreCase("ok"))==false){break;}
System.out.println("======================================================================================================");
System.out.println("---✓-----------------------------------✓---------------------------↓   ");                               
System.out.println("Flights........................Passenger details..................Summary......................Payment");
System.out.println("======================================================================================================");
System.out.println();
boolean e=(toj==1);
System.out.println("..............................................SUMMARY.................................................");
System.out.println("++++++++++++++++++++++++++++++++++++++++++++++-"+tof+"-++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println("              Airline: "+air+"                             Class: "+classs[clas]);
System.out.println("FROM: "+dc+"      TO: "+ac);        
System.out.println("Date of Departure: "+date+" "+mon); 
System.out.println("Time of flight: "+time);            
System.out.println("Flight Number: "+fln);                  
System.out.println("Flight Cost(per Adult): "+cost);
if(e){System.out.println("FROM: "+ac+"      TO: "+dc);
System.out.println("Date of Return: "+date2+" "+mon2);
System.out.println("Return Time of flight: "+time2);
System.out.println("Return Flight Number: "+fln2);
System.out.println("Return Flight Cost(per adult): "+cost2);}
System.out.println("Number of Adults: "+ad);
System.out.println("Number of Children: "+cd);
System.out.println("Number of Infants: "+inf);
System.out.println("Total passengers: "+(ad+cd+inf));
for(int i=0;i<ad;i++)
{System.out.println("Adult No."+(i+1)+" Gender: "+Character.toUpperCase(ag[i])+" Name: "+adultsFirstName[i]+" "+adultsLastName[i]);}
if(cd>0){
for(int i=0;i<cd;i++)
{System.out.println("Child No."+(i+1)+" Gender: "+Character.toUpperCase(cg[i])+" Name: "+childFirstName[i]+" "+childLastName[i]);}}
if(inf>0){
for(int i=0;i<cd;i++)
{System.out.println("Infant No."+(i+1)+" Gender:"+Character.toUpperCase(ig[i])+" Name: "+infantFirstName[i]+" "+infantLastName[i]+" Date of Birth: "+dob[i]);}}
int bp=ad+cd;
long acpc=bp*cost;
long alacpc=bp*cost2;
long ipc=inf*1200;
System.out.println("Adult and child Passenger cost: Rs."+acpc);
if(toj==1){System.out.println("Adult and child Passenger cost for return journey: Rs."+alacpc);}
if(inf>0){System.out.println("Infant Passenger cost: Rs."+ipc);}
long sf=500,gst=418;
System.out.println("Services Fee: Rs."+sf);
System.out.println("GST: Rs."+gst);
double n=Math.random()*18;
int nn=(int)n;
long odcp=(acpc+ipc)-discount[nn];
long rdcp=(alacpc+ipc)-discount[nn];
long oticketcost=odcp+gst+sf;
long rticketcost=rdcp+gst+sf;
System.out.println(air+" discount: Rs."+discount[nn]);
System.out.println(classs[clas]+" Class Ticket Cost(Inc.Service fee and GST): Rs."+oticketcost);
if(toj==1){System.out.println("Return "+classs[clas]+" Class Ticket Cost(Inc.Service fee and GST): Rs."+rticketcost);}
if(toj==1){System.out.println("Total Amount to be paid(Inc.Return journey cost): Rs."+(oticketcost+rticketcost));}
else{System.out.println("Total Amount to be paid: Rs."+oticketcost);}
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println("Enter OK to proceed to pay or cancel the flight booking");
xloop=s3.next();
if((xloop.equalsIgnoreCase("ok"))==false){break;}
System.out.println("======================================================================================================");
System.out.println("---✓-----------------------------------✓---------------------------✓----------------------------↓   ");                               
System.out.println("Flights........................Passenger details..................Summary......................Payment");
System.out.println("======================================================================================================");
System.out.println("Payment...");
if(toj==1){System.out.println("Total Amount you have to pay: Rs."+(oticketcost+rticketcost));}
else{System.out.println("Total Amount you have to pay: Rs."+oticketcost);}
String loop2="yes";
long cardno=0;int m=0,y=0,cvv=0,b=0;String firname=null,lasname=null,uid=null,pass=null;
String bank[]={"null","State Bank of India","HDFC Bank","ICICI Bank","Axis Bank","Punjab National Bank",
                "Kotak Bank","Syndicate Bank","Yes bank","Yes bank","State Bank of Patiala"};
while(loop2.equalsIgnoreCase("yes"))
{
System.out.println("How would you like to pay through?");
System.out.println("Press:(1)-Credit Card");
System.out.println("      (2)-Debit Card");
System.out.println("      (3)-Net Banking");
int ch=s3.nextInt();
switch(ch)
{
case 1:
System.out.println("Pay by Credit Card...");
System.out.println("Enter cardholder First name");
firname=s3.next();
System.out.println("Enter cardholder Last name");
lasname=s3.next();
System.out.println("Enter your credit card number");
cardno=s3.nextLong();
System.out.println("Enter validity month");
m=s3.nextInt();
System.out.println("Enter validity year");
y=s3.nextInt();
System.out.println("Enter Card Verification Value(CVV)");
cvv=s3.nextInt();
loop2="no";
break;
case 2:
System.out.println("Pay by Debit Card...");
System.out.println("Enter cardholder First name");
firname=s3.next();
System.out.println("Enter cardholder Last name");
lasname=s3.next();
System.out.println("Enter your credit card number");
cardno=s3.nextLong();
System.out.println("Enter validity month");
m=s3.nextInt();
System.out.println("Enter validity year");
y=s3.nextInt();
System.out.println("Enter Card Verification Value(CVV)");
cvv=s3.nextInt();
loop2="no";
break;
case 3:
System.out.println("Pay through Net Banking...");
System.out.println("Select your Bank:-");
System.out.println("(1)-State Bank of India");
System.out.println("(2)-HDFC Bank");
System.out.println("(3)-ICICI Bank");
System.out.println("(4)-Axis Bank");
System.out.println("(5)-Punjab National Bank");
System.out.println("(6)-Kotak Bank");
System.out.println("(7)-Syndicate Bank");
System.out.println("(8)-Yes bank");
System.out.println("(9)-Canara Bank");
System.out.println("(10)-State Bank of Patiala");
b=s3.nextInt();
if(b<1||b>10){System.out.println("Wrong choice selected! Please choose again!");continue;}
System.out.println("Enter "+bank[b]+" credentials...");
System.out.println("Enter User ID");
uid=s3.next();
System.out.println("Enter Password");
pass=s3.next();
loop2="no";
break;
default:
System.out.println("Wrong option selected! Please choose again!");
}
}
System.out.println("Enter OK to pay and book the flight or CANCEL to cancel booking and go back!");
xloop=s3.next();
if((xloop.equalsIgnoreCase("ok"))==false){break;}
System.out.println("======================================================================================================");
System.out.println("---✓-----------------------------------✓---------------------------✓----------------------------✓---");                               
System.out.println("Flights........................Passenger details..................Summary......................Payment");
System.out.println("======================================================================================================");
System.out.println("Transaction was successful! Your flight has been booked!\nYou can collect your tickets from the airport!");
System.out.println("A copy of tickets and other information will be emailed to you! Thanks for booking through Bellweather!");
flightbooked=1;
xloop="off";
}  
loop="off";
}
  break;
  case 2://International Flight Booking
  {
           if(flightbooked==1)
{System.out.println("Sorry but you can book only 1 one way or round trip flight per account!");continue;}
      String xloop="ok";
while(xloop.equalsIgnoreCase("ok"))
{
System.out.println("======================================================================================================");
System.out.println("---↓   ");                               
System.out.println("Flights........................Passenger details..................Summary......................Payment");
System.out.println("======================================================================================================");
System.out.println("Flight Details...");
int toj=0,sub=0,sub2=0,asub=0,dpc=0,apc=0,date=0,month=0,date2=0,month2=0,tod=0,tod2=0;
while(sub==0)
{System.out.println("Select type of journey...\nPress:-(1)-Round Trip  (2)-One Way");
toj=s3.nextInt();if(toj<1||toj>2){System.out.println("Wrong choice! Please Choose Again!");continue;}sub=1;
}
while(sub==1)
{
while(sub2==0){  
System.out.println("Select Departure City by pressing the corresponding number...");
System.out.println("(0)-Bangkok(BKK)       (1)-Dubai(DXB)      (2)-Berlin(TXL)");
System.out.println("(3)-New York(JFK)      (4)-London(LHR)     (5)-Delhi(DEL)");
System.out.println("(6)-Shanghai(PVG)      (7)-Paris(CDG)      (8)-Zurich(ZRH)");
System.out.println("(9)-Toronto(YYZ)       (10)-Cape Town(CPT)");
dpc=s3.nextInt();  if(dpc<0||dpc>10){System.out.println("Wrong Option selected! Please try again!");continue;}
sub2=1;
}
while(sub2==1){
System.out.println("Select Arrival City by pressing the corresponding number...");
System.out.println("(0)-Bangkok(BKK)       (1)-Dubai(DXB)      (2)-Berlin(TXL)");
System.out.println("(3)-New York(JFK)      (4)-London(LHR)     (5)-Delhi(DEL)");
System.out.println("(6)-Shanghai(PVG)      (7)-Paris(CDG)      (8)-Zurich(ZRH)");
System.out.println("(9)-Toronto(YYZ)       (10)-Cape Town(CPT)");
apc=s3.nextInt();if(apc<0||apc>10){System.out.println("Wrong Option selected! Please try again!");continue;}
sub2=0;}
if(dpc==apc){System.out.println("Departure and Arrival Cities cannot be same! Please try again!");continue;}
sub=2;
}
while(sub==2){
System.out.println("Enter Departure date...");
date=s3.nextInt();
System.out.println("Enter month...");
month=s3.nextInt();
if((month==4||month==6||month==9||month==11)&&date>30){System.out.println("This month does not have more than 30 days!");continue;}
if(month==2&&date>29){System.out.println("February does not have more than 29 days!");continue;}
if(date<1||date>31){System.out.println("Wrong date entered!");continue;}
if(month<1||month>12){System.out.println("Wrong Month Entered!");continue;}
sub=3;
}
System.out.println("Time of Flight...");
while(sub==3){
System.out.println("(1)-Flight At Night  (2)-Flight At Day");
tod=s3.nextInt();if(tod<1||tod>2){System.out.println("Wrong Choice! Please choose the correct option!");continue;}
sub=4;
}
if(toj==1)
{
while(asub==0){
System.out.println("Enter Return date...");
date2=s3.nextInt();
System.out.println("Enter month...");
month2=s3.nextInt();  
if((month==4||month==6||month==9||month==11)&&date>30){System.out.println("This month does not have more than 30 days!");continue;}
if(month==2&&date>29){System.out.println("February does not have more than 29 days!");continue;}
if(date<1||date>31){System.out.println("Wrong date entered!");continue;}
if(month<1||month>12){System.out.println("Wrong Month Entered!");continue;}
asub=1;
}
}
if(toj==1)
{
System.out.println("Return Time of Flight...");
while(asub==1){
System.out.println("(1)-Flight At Night  (2)-Flight At Day");
tod2=s3.nextInt();if(tod2<1||tod2>2){System.out.println("Wrong Choice! Please choose the correct option!");continue;}
asub=2;
}
}
boolean flcheck,flcheck2=false;
flcheck=fb3.flachk(date,month,tod);
flcheck2=fb3.flachk(date2,month2,tod2);
int airl=0;
while(sub==4)
{
System.out.println("Select the Airline...");
System.out.println("(1)-Air India (2)-SpiceJet (3)-IndiGo (4)-Jet Airways (5)-GoAir (6)-Vistara (7)-Foreign Airline");
airl=s3.nextInt();
if(airl<1||airl>7){System.out.println("Wrong Choice! Please Choose Again!");continue;}
sub=5;
}
int clas=0;
while(sub==5){
System.out.println("Select class...\nPress-(1)-Economic  (2)-Business  (3)-First");
clas=s3.nextInt();if(clas<1||clas>3){System.out.println("Wrong Option selected! Please try again!");continue; }
sub=6;
}
System.out.println("*********************************************************************************************");
long dprice[]={5000,3000,11000,13000,12000,5000,3000,10000,8000,12000,7500,};
long aprice[]={10000,5000,8000,15000,10000,8000,8500,14500,10000,15000,12000};
long discount[]={500,1000,800,750,650,400,700,200,100,350,900,1100,1500,2000,1300,1200,1600,1800};
String classs[]={"null","Economic","Business","First"};
String fln,fln2,air,time,time2,mon,mon2,dc,ac,cod=fb3.numtostr(dpc,"nat"),coa=fb3.numtostr(apc,"nat");
fln=fb3.ifltngen(airl,date,month,tod);fln2=fb3.ifltngen(airl,date2,month2,tod2);
air=fb3.numtostr(airl,"airline");
time=(tod==1)? "Flight At Night":"Flight At Day";
time2=(tod2==1)?"Flight At Night":"Flight At Day";
mon=fb3.numtostr(month,"month");
mon2=fb3.numtostr(month2,"month");
dc=fb3.numtostr(dpc,"icity");
ac=fb3.numtostr(apc,"icity");
String fstat=(flcheck==true)? "Flight is Available!":"Sorry but the flight is not available!";
String fstat2=(flcheck2==true)? "Flight is Available!":"Sorry but the flight is not available!";
long owc=dprice[dpc]+aprice[apc];
long rwc=dprice[apc]+aprice[dpc];
long cost=clas*owc;
long cost2=clas*rwc;
String tof=(toj==1)? "Round Trip":"One Way";
System.out.println("Flight Status...");
System.out.println("Type of Flight: "+tof);
System.out.println("FROM: "+dc+"("+cod+")"+"                TO: "+ac+"("+coa+")");
System.out.println("Date of Departure: "+date+" "+mon);
System.out.println("Time of Flight: "+time);
System.out.println("Airline: "+air);
System.out.println("Class: "+classs[clas]);
System.out.println("Flight Status: "+fstat);
if(flcheck==true){System.out.println("Flight Number: "+fln);}
if(flcheck==true&&(dpc!=5&&apc!=5)){System.out.println("No direct route available! Change of aircraft at Delhi!");}
if(flcheck==true){System.out.println("Flight Cost(per adult): Rs."+cost);}
if(toj==1){System.out.println("****************************************************************************************************");
System.out.println("Return Flight status...");
System.out.println("FROM: "+ac+"("+coa+")"+"                TO: "+dc+"("+cod+")");
System.out.println("Date of Return: "+date2+" "+mon2);
System.out.println("Time of Return Flight: "+time2);
System.out.println("Airline: "+air);
System.out.println("Class: "+classs[clas]);
if(flcheck==false)
{System.out.println("Return Flight Status: Sorry but the flight is not available!");}
else
{System.out.println("Return Flight Status: "+fstat2);
if(flcheck2==true){System.out.println("Return Flight Number: "+fln2);System.out.println("Return Flight Cost(per adult): Rs."+cost2);
if(flcheck2==true&&(dpc!=5&&apc!=5)){System.out.println("No direct route available! Change of aircraft at Delhi!");}}
}
}
if(flcheck==false){break;}
System.out.println("Enter OK to continue booking or CANCEL to cancel flight booking and go back!");
xloop=s3.next();
if((xloop.equalsIgnoreCase("ok"))==false){break;}
System.out.println("======================================================================================================");
System.out.println("---✓-----------------------------------↓   ");                               
System.out.println("Flights........................Passenger details..................Summary......................Payment");
System.out.println("======================================================================================================");
System.out.println("Passenger details...");
int ad=0,cd=0,inf=0;
while(sub==6){
System.out.println("Enter number of adults..."); 
ad=s3.nextInt(); 
if(ad<1){System.out.println("Atleast one adult is required to accompany any junior passenger!");continue;}
if(ad>10){System.out.println("You can buy tickets for only 10 adults per account!");continue;}
sub=7;
}
while(sub==7){
System.out.println("Enter number of children...");
cd=s3.nextInt();if(cd>5){System.out.println("You can buy tickets for only 5 children per account!");continue;} 
sub=8;}
while(sub==8){
System.out.println("Enter number of infants...");
inf=s3.nextInt();if(inf>5){System.out.println("You can buy tickets for only 5 infants per account!");continue;}
sub=9;}
System.out.println("Enter Adult details...");
String adultsFirstName[]=new String[10];
String adultsLastName[]=new String[10];
long apassportno[]=new long[10];
String apassportnation[]=new String[10];
String apassportissue[]=new String[10];
String apassportexpiry[]=new String[10];
char ag[]=new char[10];
for(int i=0;i<ad;i++)
{
System.out.println("Adult No. "+(i+1));
System.out.println("Gender:-(M)-Male   (F)-Female");
ag[i]=s3.next().charAt(0);
System.out.println("Enter First Name...");
adultsFirstName[i]=s3.next();
System.out.println("Enter Last Name...");
adultsLastName[i]=s3.next();
System.out.println("Enter Passport Number...");
apassportno[i]=s3.nextLong();
System.out.println("Enter Passport Issuing Country...");
apassportnation[i]=s3.next();
System.out.println("Enter Passport Issue Date(dd-mm-yyyy format)");
apassportissue[i]=s3.next();
System.out.println("Enter Passport Expiry Date(dd-mm-yyyy format)");
apassportexpiry[i]=s3.next();
}
String childFirstName[]=new String[5];
String childLastName[]=new String[5];
char cg[]=new char[5];
long cpassportno[]=new long[5];
String cpassportnation[]=new String[5];
String cpassportissue[]=new String[5];
String cpassportexpiry[]=new String[5];
for(int i=0;i<cd;i++)
{
System.out.println("Child No. "+(i+1));
System.out.println("Gender:-(M)-Male   (F)-Female");
cg[i]=s3.next().charAt(0);
System.out.println("Enter First Name...");
childFirstName[i]=s3.next();
System.out.println("Enter Last Name...");
childLastName[i]=s3.next();
System.out.println("Enter Passport Number...");
cpassportno[i]=s3.nextLong();
System.out.println("Enter Passport Issuing Country...");
cpassportnation[i]=s3.next();
System.out.println("Enter Passport Issue Date(dd-mm-yyyy format)");
cpassportissue[i]=s3.next();
System.out.println("Enter Passport Expiry Date(dd-mm-yyyy format)");
cpassportexpiry[i]=s3.next();
}
String infantFirstName[]=new String[5];
String infantLastName[]=new String[5];
char ig[]=new char[5];
String dob[]=new String[5];
long ipassportno[]=new long[5];
String ipassportnation[]=new String[5];
String ipassportissue[]=new String[5];
String ipassportexpiry[]=new String[5];
for(int i=0;i<inf;i++)
{
System.out.println("Infant No. "+(i+1));
System.out.println("Gender:-(M)-Male   (F)-Female");
cg[i]=s3.next().charAt(0);
System.out.println("Enter First Name...");
childFirstName[i]=s3.next();
System.out.println("Enter Last Name...");
childLastName[i]=s3.next();
System.out.println("Enter Date of Birth...(dd-mm-yyyy format)");
dob[i]=s3.next();
System.out.println("Enter Passport Number...");
ipassportno[i]=s3.nextLong();
System.out.println("Enter Passport Issuing Country...");
ipassportnation[i]=s3.next();
System.out.println("Enter Passport Issue Date(dd-mm-yyyy format)");
ipassportissue[i]=s3.next();
System.out.println("Enter Passport Expiry Date(dd-mm-yyyy format)");
ipassportexpiry[i]=s3.next();
}
String fname,lname,eid,mob,country,city;
System.out.println("Enter contact details...");
System.out.println("Enter First Name...");
fname=s3.next();
System.out.println("Enter Last Name");
lname=s3.next();
System.out.println("Enter Email ID");
eid=s3.next();
System.out.println("Enter Mobile No.");
mob=s3.next();
System.out.println("Enter Country");
country=s3.next();
System.out.println("Enter City");
city=s3.next();
System.out.println("Enter OK to continue booking or CANCEL to cancel flight booking and go back!");
xloop=s3.next();
if((xloop.equalsIgnoreCase("ok"))==false){break;}
System.out.println("======================================================================================================");
System.out.println("---✓-----------------------------------✓---------------------------↓   ");                               
System.out.println("Flights........................Passenger details..................Summary......................Payment");
System.out.println("======================================================================================================");
System.out.println();
boolean e=(toj==1);
System.out.println("..............................................SUMMARY.................................................");
System.out.println("++++++++++++++++++++++++++++++++++++++++++++++-"+tof+"-++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println("              Airline: "+air+"                             Class: "+classs[clas]);
System.out.println("FROM: "+dc+"("+cod+")"+"    TO: "+ac+"("+coa+")");        
System.out.println("Date of Departure: "+date+" "+mon); 
System.out.println("Time of flight: "+time);            
System.out.println("Flight Number: "+fln);                  
System.out.println("Flight Cost(per Adult): "+cost);
if(e){System.out.println("FROM: "+ac+"("+coa+")"+"    TO: "+dc+"("+cod+")");
System.out.println("Date of Return: "+date2+" "+mon2);
System.out.println("Return Time of flight: "+time2);
System.out.println("Return Flight Number: "+fln2);
System.out.println("Return Flight Cost(per adult): "+cost2);}
System.out.println("Number of Adults: "+ad);
System.out.println("Number of Children: "+cd);
System.out.println("Number of Infants: "+inf);
System.out.println("Total passengers: "+(ad+cd+inf));
for(int i=0;i<ad;i++)
{System.out.println("Adult No."+(i+1)+" Gender: "+Character.toUpperCase(ag[i])+" Name: "+adultsFirstName[i]+" "+adultsLastName[i]);
System.out.println("Passport Number: "+apassportno[i]+"   Passport Issuing Country: "+apassportnation[i]);
System.out.println("Passport Issue date: "+apassportissue[i]+"   Passport Expiry date: "+apassportexpiry[i]);}
if(cd>0){
for(int i=0;i<cd;i++)
{System.out.println("Child No."+(i+1)+" Gender: "+Character.toUpperCase(cg[i])+" Name: "+childFirstName[i]+" "+childLastName[i]);
System.out.println("Passport Number: "+cpassportno[i]+"   Passport Issuing Country: "+cpassportnation[i]);
System.out.println("Passport Issue date: "+cpassportissue[i]+"   Passport Expiry date: "+cpassportexpiry[i]);}}
if(inf>0){
for(int i=0;i<cd;i++)
{System.out.println("Infant No."+(i+1)+" Gender:"+Character.toUpperCase(ig[i])+" Name: "+infantFirstName[i]+" "+infantLastName[i]+" Date of Birth: "+dob[i]);
System.out.println("Passport Number: "+ipassportno[i]+"   Passport Issuing Country: "+ipassportnation[i]);
System.out.println("Passport Issue date: "+ipassportissue[i]+"   Passport Expiry date: "+ipassportexpiry[i]);}}
int bp=ad+cd;
long acpc=bp*cost;
long alacpc=bp*cost2;
long ipc=inf*1200;
System.out.println("Adult and child Passenger cost: Rs."+acpc);
if(toj==1){System.out.println("Adult and child Passenger cost for return journey: Rs."+alacpc);}
if(inf>0){System.out.println("Infant Passenger cost: Rs."+ipc);}
long sf=500,gst=418;
System.out.println("Services Fee: Rs."+sf);
System.out.println("GST: Rs."+gst);
double n=Math.random()*18;
int nn=(int)n;
long odcp=(acpc+ipc)-discount[nn];
long rdcp=(alacpc+ipc)-discount[nn];
long oticketcost=odcp+gst+sf;
long rticketcost=rdcp+gst+sf;
System.out.println(air+" discount: Rs."+discount[nn]);
System.out.println(classs[clas]+" Class Ticket Cost(Inc.Service fee and GST): Rs."+oticketcost);
if(toj==1){System.out.println("Return "+classs[clas]+" Class Ticket Cost(Inc.Service fee and GST): Rs."+rticketcost);}
if(toj==1){System.out.println("Total Amount to be paid(Inc.Return journey cost): Rs."+(oticketcost+rticketcost));}
else{System.out.println("Total Amount to be paid: Rs."+oticketcost);}
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println("Enter OK to proceed to pay or cancel the flight booking");
xloop=s3.next();
if((xloop.equalsIgnoreCase("ok"))==false){break;}
System.out.println("======================================================================================================");
System.out.println("---✓-----------------------------------✓---------------------------✓----------------------------↓   ");                               
System.out.println("Flights........................Passenger details..................Summary......................Payment");
System.out.println("======================================================================================================");
System.out.println("Payment...");
if(toj==1){System.out.println("Total Amount you have to pay: Rs."+(oticketcost+rticketcost));}
else{System.out.println("Total Amount you have to pay: Rs."+oticketcost);}
String loop2="yes";
long cardno=0;int m=0,y=0,cvv=0,b=0;String firname=null,lasname=null,uid=null,pass=null;
String bank[]={"null","State Bank of India","HDFC Bank","ICICI Bank","Axis Bank","Punjab National Bank",
                "Kotak Bank","Syndicate Bank","Yes bank","Yes bank","State Bank of Patiala"};
while(loop2.equalsIgnoreCase("yes"))
{
System.out.println("How would you like to pay through?");
System.out.println("Press:(1)-Credit Card");
System.out.println("      (2)-Debit Card");
System.out.println("      (3)-Net Banking");
int ch=s3.nextInt();
switch(ch)
{
case 1:
System.out.println("Pay by Credit Card...");
System.out.println("Enter cardholder First name");
firname=s3.next();
System.out.println("Enter cardholder Last name");
lasname=s3.next();
System.out.println("Enter your credit card number");
cardno=s3.nextLong();
System.out.println("Enter validity month");
m=s3.nextInt();
System.out.println("Enter validity year");
y=s3.nextInt();
System.out.println("Enter Card Verification Value(CVV)");
cvv=s3.nextInt();
loop2="no";
break;
case 2:
System.out.println("Pay by Debit Card...");
System.out.println("Enter cardholder First name");
firname=s3.next();
System.out.println("Enter cardholder Last name");
lasname=s3.next();
System.out.println("Enter your credit card number");
cardno=s3.nextLong();
System.out.println("Enter validity month");
m=s3.nextInt();
System.out.println("Enter validity year");
y=s3.nextInt();
System.out.println("Enter Card Verification Value(CVV)");
cvv=s3.nextInt();
loop2="no";
break;
case 3:
System.out.println("Pay through Net Banking...");
System.out.println("Select your Bank:-");
System.out.println("(1)-State Bank of India");
System.out.println("(2)-HDFC Bank");
System.out.println("(3)-ICICI Bank");
System.out.println("(4)-Axis Bank");
System.out.println("(5)-Punjab National Bank");
System.out.println("(6)-Kotak Bank");
System.out.println("(7)-Syndicate Bank");
System.out.println("(8)-Yes bank");
System.out.println("(9)-Canara Bank");
System.out.println("(10)-State Bank of Patiala");
b=s3.nextInt();
if(b<1||b>10){System.out.println("Wrong choice selected! Please choose again!");continue;}
System.out.println("Enter "+bank[b]+" credentials...");
System.out.println("Enter User ID");
uid=s3.next();
System.out.println("Enter Password");
pass=s3.next();
loop2="no";
break;
default:
System.out.println("Wrong option selected! Please choose again!");
}
}
System.out.println("Enter OK to pay and book the flight or CANCEL to cancel booking and go back!");
xloop=s3.next();
if((xloop.equalsIgnoreCase("ok"))==false){break;}
System.out.println("======================================================================================================");
System.out.println("---✓-----------------------------------✓---------------------------✓----------------------------✓---");                               
System.out.println("Flights........................Passenger details..................Summary......................Payment");
System.out.println("======================================================================================================");
System.out.println("Transaction was successful! Your flight has been booked!\nYou can collect your tickets from the airport!");
System.out.println("A copy of tickets and other information will be emailed to you!\nPlease ensure that visa on your passport is valid throughout your journey!");
System.out.println("Thanks for booking through Bellweather!");
flightbooked=1;
xloop="off";
} 
loop="off";
  }    
  break;
  case 3://Flight Cancellation
  {
     if(flightbooked==0){System.out.println("Flight is not yet booked!");}
     else
     {
      System.out.println("Are you sure you want to cancel the flight?\n(yes)       (no)");
      String inp=s3.next();
      if(inp.equalsIgnoreCase("yes")){flightbooked=0;
       System.out.println("Flight cancelled successfully!\nYour money will be refunded back to your bank account!");}
     }
     loop="off";
  }
  break;
  default:
  System.out.println("Wrong option selected! Please choose again!");
  }
  }
}
}
void convertCurrency()//4th Module:To convert Currencies
{
Scanner s4=new Scanner(System.in);
String loop="yes";
int fc=0,tc=0,sub=0;
double famt=0,tamt=0;
String curr[]={"null","U.S Dollar(USD)","Indian Rupees(INR)","Euro(EUR)","British Pound(GBP)","Arab Emirates Dirham(AED)"};
String cur[]={"n","$","₹","€","£","د.إ"};
double currmatrix[][]={{0},{0,1,65,0.85,0.76,3.67},{0,0.015,1,0.013,0.012,0.057},{0,1.18,76.59,1,0.89,4.33},{0,1.32,85.75,1.12,1,4.85},{0,0.27,17.68,0.23,0.21,1}};
System.out.println("Currency Converter...");
while(loop.equalsIgnoreCase("yes"))
{sub=0;
 while(sub==0){
System.out.println("Select the currency to be converted...");
System.out.println("Press:-(1)-U.S Dollar(USD)...(2)Indian Rupees(INR)...(3)Euro(EUR)...(4)-British Pound(GBP)...(5)-Arab Emirates Dirham(AED)");
fc=s4.nextInt();if(fc<1||fc>5){System.out.println("Wrong option selected! Please choose again!");continue;}
sub=1;}
System.out.print("Enter the Amount in "+curr[fc]+": "+cur[fc]);
famt=s4.nextDouble();
while(sub==1){
System.out.println("Select the currency into which the amount has to be converted...");
System.out.println("Press:-(1)-U.S Dollar(USD)...(2)Indian Rupees(INR)...(3)Euro(EUR)...(4)-British Pound(GBP)...(5)-Arab Emirates Dirham(AED)");
tc=s4.nextInt();if(fc<1||fc>5){System.out.println("Wrong option selected! Please choose again!");continue;}
sub=2;}
tamt=famt*currmatrix[fc][tc];
System.out.println("Amount in "+curr[tc]+": "+cur[tc]+tamt);
System.out.println(hr);
System.out.println("Do you want to again convert currencies?(yes/no)");
loop=s4.next();
}
}
void log()//5th Module:To Log In or Log Out
{
Scanner s5=new Scanner(System.in);
String u,p;
    System.out.println("Log IN Or Log OUT...");
    System.out.println("Press- (1)-Log IN     (2)-Log OUT");
    int ch=s5.nextInt();
    switch(ch)
    {
    case 1:
    if(acchk==0)
    {System.out.println("You Cannot Log In if you do not have Bellweather Account! Please create an account in order to log in the application!");}
    else if(log==1)
    {System.out.println("You are already Logged In!");}
    else
    {
        int loop=1;
        while(loop==1)
        {
        System.out.println("Please enter the prompted account credentials...");
        System.out.print("Enter Username:");
        u=s5.next();
        System.out.print("Enter Password:");
        p=s5.next();
        if(u.equals(uname)&&p.equals(password))
        {log=1;System.out.println("Log IN successful!");}
        else
        {System.out.println("Wrong credentials entered! Please re-enter the correct credentials!");continue;}
       loop=0;
       }
    }
    break;
    case 2:
    if(log==0)
    {System.out.println("You haven't logged in yet!");}
    else
    {
    System.out.println("Are you sure you want to Log Out?\n(Yes)    (no)");
    String in=s5.next();
    if(in.equalsIgnoreCase("yes")){log=0;System.out.println("Log Out successful!");}
    }
    break;
    default:
    System.out.println("Wrong Choice! Please Choose Again!");
    }
}
void createAccount()//6th Module:To create Bellweather Account
{
    Scanner s6=new Scanner(System.in);
    String fn,ln,un,pass,rpass,ad,mobno,bnation;
    int d,m,y;
    int loop=1;
System.out.println("Bellweather Account Creation...");
while(loop==1)
{
System.out.println("Enter your First Name");
fn=s6.next();
System.out.println("Enter your Last Name");
ln=s6.next();
System.out.println("Enter your Date of Birth(in dd/mm/yyyy format)");
System.out.println("Enter Day");
d=s6.nextInt();
System.out.println("Enter Month");
m=s6.nextInt();
System.out.println("Enter Year");
y=s6.nextInt();
System.out.println("Enter your Username(email id or Mobile Number)");
un=s6.next();
System.out.println("Enter your password");
pass=s6.next();
System.out.println("Re-enter your password for Re-confirmation");
rpass=s6.next();
if(rpass.equals(pass)){System.out.println("Password successfully Re-confirmed!");}
else{System.out.println("Password Re-confirmation failed! Please Re-enter the form!");continue;}
System.out.println("Enter your address");
ad=s6.next();
System.out.println("Enter your Mobile Number");
mobno=s6.next();
System.out.println("Enter Country of Birth");
bnation=s6.next();
System.out.println("Congratulations! You have successfully created your Bellweather Account!");
acchk=1;
uname=un;
password=pass;
loop=0;
}
}
void TicketPrice()//7th:To Calculate Fligh Ticket Cost
{
Scanner s7=new Scanner(System.in);
FlightBook fb7=new FlightBook();
System.out.println("View Flight Tickets Price...");
String loop="yes";
while(loop.equalsIgnoreCase("yes"))
{
System.out.println("Press-(1)-Domestic Flights...........(2)-International Flights");
int x=s7.nextInt();
switch(x)
{
case 1://Domestic
{
int dpc=0,apc=0,toj=0,date=0,month=0,date2=0,month2=0,adn=0,cdn=0,ifn=0,clas=0,arl=0,subloop=0,subloop2=1,subloop3=1;
while(subloop==0){System.out.println("Type of journey:-\nPress-(1)-Round Trip  (2)-One way");
toj=s7.nextInt();if(toj<1||toj>2){System.out.println("Wrong Option selected! Please try again!");continue;}
subloop=1;
}
while(subloop2==1){
while(subloop==1){  
System.out.println("Select Departure City by pressing the corresponding number...");
System.out.println("(0)-Ahmedabad(AMD)       (1)-Amritsar(ATQ)    (2)-Bengaluru(BLR)");
System.out.println("(3)-Chandigarh(IXC)      (4)-Chennai(MAA)     (5)-Dehradun(DED)");
System.out.println("(6)-Delhi(DEL)           (7)-Goa(GOI)         (8)-Guwahati(GAU)");
System.out.println("(9)-Hyderabad(HYD)       (10)-Jaipur(JAI)     (11)-Kochi(COK)");
System.out.println("(12)-Kolkata(CCU)        (13)-Mumbai(BOM)     (14)-Patna(PAT)");
System.out.println("(15)-Port Blair(IXZ)     (16)-Pune(PNQ)       (17)-Srinagar(SXR)");
System.out.println("(18)-Vishakhapatnam(VTZ) (19)-Coimbatore(CJB) (20)-Jabalpur(JLR)");
dpc=s7.nextInt();  if(dpc<0||dpc>20){System.out.println("Wrong Option selected! Please try again!");continue;}
subloop=2;
}
while(subloop==2){
System.out.println("Select Arrival City by pressing the corresponding number...");
System.out.println("(0)-Ahmedabad(AMD)       (1)-Amritsar(ATQ)    (2)-Bengaluru(BLR)");
System.out.println("(3)-Chandigarh(IXC)      (4)-Chennai(MAA)     (5)-Dehradun(DED)");
System.out.println("(6)-Delhi(DEL)           (7)-Goa(GOI)         (8)-Guwahati(GAU)");
System.out.println("(9)-Hyderabad(HYD)       (10)-Jaipur(JAI)     (11)-Kochi(COK)");
System.out.println("(12)-Kolkata(CCU)        (13)-Mumbai(BOM)     (14)-Patna(PAT)");
System.out.println("(15)-Port Blair(IXZ)     (16)-Pune(PNQ)       (17)-Srinagar(SXR)");
System.out.println("(18)-Vishakhapatnam(VTZ) (19)-Coimbatore(CJB) (20)-Jabalpur(JLR)");
apc=s7.nextInt();if(apc<0||apc>20){System.out.println("Wrong Option selected! Please try again!");continue;}
subloop=3;}
if(dpc==apc){System.out.println("Departure and Arrival Cities cannot be same! Please try again!");continue;}
subloop2=0;
}
while(subloop==3){
System.out.println("Enter Departure date...");
date=s7.nextInt();
System.out.println("Enter month...");
month=s7.nextInt();
if((month==4||month==6||month==9||month==11)&&date>30){System.out.println("This month does not have more than 30 days!");continue;}
if(month==2&&date>29){System.out.println("February does not have more than 29 days!");continue;}
if(date<1||date>31){System.out.println("Wrong date entered!");continue;}
if(month<1||month>12){System.out.println("Wrong Month Entered!");continue;}
subloop=4;
}
if(toj==1)
{
while(subloop3==1){
System.out.println("Enter Return date...");
date2=s7.nextInt();
System.out.println("Enter month...");
month2=s7.nextInt();  
if((month==4||month==6||month==9||month==11)&&date>30){System.out.println("This month does not have more than 30 days!");continue;}
if(month==2&&date>29){System.out.println("February does not have more than 29 days!");continue;}
if(date<1||date>31){System.out.println("Wrong date entered!");continue;}
if(month<1||month>12){System.out.println("Wrong Month Entered!");continue;}
subloop3=0;
}
}
while(subloop==4){
System.out.println("Enter number of adults..."); 
adn=s7.nextInt(); 
if(adn<1){System.out.println("Atleast one adult is required to accompany any junior passenger!");continue;}
if(adn>10){System.out.println("You can buy tickets for only 10 adults per account!");continue;}
subloop=5;
}
while(subloop==5){
System.out.println("Enter number of children...");
cdn=s7.nextInt();if(cdn>5){System.out.println("You can buy tickets for only 5 children per account!");continue;} 
subloop=6;}
while(subloop==6){
System.out.println("Enter number of infants...");
ifn=s7.nextInt();if(ifn>5){System.out.println("You can buy tickets for only 5 infants per account!");continue;}
subloop=7;}
while(subloop==7){
System.out.println("Select class...\nPress-(1)-Economic  (2)-Business  (3)-First");
clas=s7.nextInt();if(clas<1||clas>3){System.out.println("Wrong Option selected! Please try again!");continue; }
subloop=8;
}
while(subloop==8)
{System.out.println("Enter the Airline...");
 System.out.println("(1)-Air India (2)-SpiceJet (3)-IndiGo (4)-Jet Airways (5)-GoAir (6)-Vistara");
 arl=s7.nextInt();
 if(arl<1||arl>6){System.out.println("Wrong Option selected! Please try again!");continue;}
 subloop=9;
}
long dprice[]={1000,500,1200,2000,2500,3000,500,1500,3000,1000,700,1000,1700,2000,1300,3500,2000,3000,1500,1000,1000};
long aprice[]={4000,4000,8000,5000,10000,6000,2000,10000,12000,3000,5000,2000,7000,8000,4000,15000,5000,6000,5000,4000,2500};
long discount[]={500,1000,800,750,650,400,700,200,100,350,900,1100,1500,2000,1300,1200,1600,1800};
long basic=0,basic2=0,gst=418,st=500;
basic=dprice[dpc]+aprice[apc];
basic2=dprice[apc]+aprice[dpc];
long cost=0,cost2=0;
cost=clas*basic;cost2=clas*basic2;
long ipc=ifn*1200;
int bp=adn+cdn;
long acpc=bp*cost;
long alacpc=bp*cost2;
System.out.println(hr);
System.out.println("FROM: "+fb7.numtostr(dpc,"dcity")+"              TO: "+fb7.numtostr(apc,"dcity"));
String tojs=(toj==1)? "Round Trip":"One Way";
System.out.println("Type of Journey: "+tojs);
System.out.println("Date of Departure: "+date+" "+fb7.numtostr(month,"month"));
System.out.println("Number of Adults: "+adn);
System.out.println("Number of Children: "+cdn);
System.out.println("Number of Infants: "+ifn);
String classs=null;
if(clas==1){classs="Economic";}
if(clas==2){classs="Business";}
if(clas==3){classs="First";}
System.out.println("Class: "+classs);
System.out.println("Airline: "+fb7.numtostr(arl,"airline"));
System.out.println("Travel cost: Rs."+cost);
System.out.println("Passenger Cost for Adults and Children: Rs."+acpc);
if(ifn>0){System.out.println("Passenger Cost for Infant: Rs."+ipc);}
if(toj==1){System.out.println("Return journey...");}
if(toj==1){System.out.println("FROM: "+fb7.numtostr(apc,"dcity")+"              TO: "+fb7.numtostr(dpc,"dcity"));}
if(toj==1){System.out.println("Date of Return: "+date2+" "+fb7.numtostr(month2,"month"));}
if(toj==1){System.out.println("Return Travel Cost: Rs."+cost2);
System.out.println("Passenger cost for Adults and Children for return journey: Rs."+alacpc);}
System.out.println("Services Fee: Rs."+st);
System.out.println("GST: Rs."+gst);
double rr=Math.random()*18;
int r=(int)rr;
System.out.println(fb7.numtostr(arl,"airline")+" Discount: Rs."+discount[r]);
long oticketp=((acpc+ipc)-discount[r])+gst+st;
long rticketp=((alacpc+ipc)-discount[r])+gst+st;
System.out.println("Ticket cost(Inc.GST and Services Fee): Rs."+oticketp);
if(toj==1){System.out.println("Return ticket Cost(Inc.GST and Services Fee): Rs."+rticketp);}
if(toj==1){System.out.println("Total Travel Cost(Inc.Return journey cost): Rs."+(oticketp+rticketp));}
else{System.out.println("Total Travel Cost: Rs."+oticketp);}
System.out.println(hr);
System.out.println("Do you wish to again see Flight Ticket Price?");
loop=s7.next();
}
break;
case 2://International
{
int dpc=0,apc=0,toj=0,date=0,month=0,date2=0,month2=0,adn=0,cdn=0,ifn=0,clas=0,arl=0,subloop=0,subloop2=1,subloop3=1;
while(subloop==0){System.out.println("Type of journey:-\nPress-(1)-Round Trip  (2)-One way");
toj=s7.nextInt();if(toj<1||toj>2){System.out.println("Wrong Option selected! Please try again!");continue;}
subloop=1;
}
while(subloop2==1){
while(subloop==1){  
System.out.println("Select Departure City by pressing the corresponding number...");
System.out.println("(0)-Bangkok(BKK)       (1)-Dubai(DXB)      (2)-Berlin(TXL)");
System.out.println("(3)-New York(JFK)      (4)-London(LHR)     (5)-Delhi(DEL)");
System.out.println("(6)-Shanghai(PVG)      (7)-Paris(CDG)      (8)-Zurich(ZRH)");
System.out.println("(9)-Toronto(YYZ)       (10)-Cape Town(CPT)");
dpc=s7.nextInt();  if(dpc<0||dpc>10){System.out.println("Wrong Option selected! Please try again!");continue;}
subloop=2;
}
while(subloop==2){
System.out.println("Select Arrival City by pressing the corresponding number...");
System.out.println("(0)-Bangkok(BKK)       (1)-Dubai(DXB)      (2)-Berlin(TXL)");
System.out.println("(3)-New York(JFK)      (4)-London(LHR)     (5)-Delhi(DEL)");
System.out.println("(6)-Shanghai(PVG)      (7)-Paris(CDG)      (8)-Zurich(ZRH)");
System.out.println("(9)-Toronto(YYZ)       (10)-Cape Town(CPT)");
apc=s7.nextInt();if(apc<0||apc>10){System.out.println("Wrong Option selected! Please try again!");continue;}
subloop=3;}
if(dpc==apc){System.out.println("Departure and Arrival Cities cannot be same! Please try again!");continue;}
subloop2=0;
}
while(subloop==3){
System.out.println("Enter Departure date...");
date=s7.nextInt();
System.out.println("Enter month...");
month=s7.nextInt();
if((month==4||month==6||month==9||month==11)&&date>30){System.out.println("This month does not have more than 30 days!");continue;}
if(month==2&&date>29){System.out.println("February does not have more than 29 days!");continue;}
if(date<1||date>31){System.out.println("Wrong date entered!");continue;}
if(month<1||month>12){System.out.println("Wrong Month Entered!");continue;}
subloop=4;
}
if(toj==1)
{
while(subloop3==1){
System.out.println("Enter Return date...");
date2=s7.nextInt();
System.out.println("Enter month...");
month2=s7.nextInt();  
if((month==4||month==6||month==9||month==11)&&date>30){System.out.println("This month does not have more than 30 days!");continue;}
if(month==2&&date>29){System.out.println("February does not have more than 29 days!");continue;}
if(date<1||date>31){System.out.println("Wrong date entered!");continue;}
if(month<1||month>12){System.out.println("Wrong Month Entered!");continue;}
subloop3=0;
}
}
while(subloop==4){
System.out.println("Enter number of adults..."); 
adn=s7.nextInt(); 
if(adn<1){System.out.println("Atleast one adult is required to accompany any junior passenger!");continue;}
if(adn>10){System.out.println("You can buy tickets for only 10 adults per account!");continue;}
subloop=5;
}
while(subloop==5){
System.out.println("Enter number of children...");
cdn=s7.nextInt();if(cdn>5){System.out.println("You can buy tickets for only 5 children per account!");continue;} 
subloop=6;}
while(subloop==6){
System.out.println("Enter number of infants...");
ifn=s7.nextInt();if(ifn>5){System.out.println("You can buy tickets for only 5 infants per account!");continue;}
subloop=7;}
while(subloop==7){
System.out.println("Select class...\nPress-(1)-Economic  (2)-Business  (3)-First");
clas=s7.nextInt();if(clas<1||clas>3){System.out.println("Wrong Option selected! Please try again!");continue; }
subloop=8;
}
while(subloop==8)
{System.out.println("Enter the Airline...");
 System.out.println("(1)-Air India (2)-SpiceJet (3)-IndiGo (4)-Jet Airways (5)-GoAir (6)-Vistara (7)-Foreign Airline");
 arl=s7.nextInt();
 if(arl<1||arl>7){System.out.println("Wrong Option selected! Please try again!");continue;}
 subloop=9;
}
long dprice[]={5000,3000,11000,13000,12000,5000,3000,10000,8000,12000,7500,};
long aprice[]={10000,5000,8000,15000,10000,8000,8500,14500,10000,15000,12000};
long discount[]={500,1000,800,750,650,400,700,200,100,350,900,1100,1500,2000,1300,1200,1600,1800};
long basic=0,basic2=0,gst=418,st=500;
basic=dprice[dpc]+aprice[apc];
basic2=dprice[apc]+aprice[dpc];
long cost=0,cost2=0;
cost=clas*basic;cost2=clas*basic2;
long ipc=ifn*1200;
int bp=adn+cdn;
long acpc=bp*cost;
long alacpc=bp*cost2;
System.out.println(hr);
System.out.println("FROM: "+fb7.numtostr(dpc,"icity")+"("+fb7.numtostr(dpc,"nat")+")        TO: "+fb7.numtostr(apc,"icity")+"("+fb7.numtostr(apc,"nat")+")");
String tojs=(toj==1)? "Round Trip":"One Way";
System.out.println("Type of Journey: "+tojs);
System.out.println("Date of Departure: "+date+" "+fb7.numtostr(month,"month"));
System.out.println("Number of Adults: "+adn);
System.out.println("Number of Children: "+cdn);
System.out.println("Number of Infants: "+ifn);
String classs=null;
if(clas==1){classs="Economic";}
if(clas==2){classs="Business";}
if(clas==3){classs="First";}
System.out.println("Class: "+classs);
System.out.println("Airline: "+fb7.numtostr(arl,"airline"));
System.out.println("Travel cost: Rs."+cost);
System.out.println("Passenger Cost for Adults and Children: Rs."+acpc);
if(ifn>0){System.out.println("Passenger Cost for Infant: Rs."+ipc);}
if(toj==1){System.out.println("Return journey...");}
if(toj==1){System.out.println("FROM: "+fb7.numtostr(apc,"icity")+"("+fb7.numtostr(apc,"nat")+")        TO: "+fb7.numtostr(dpc,"icity")+"("+fb7.numtostr(dpc,"nat")+")");}
if(toj==1){System.out.println("Date of Return: "+date2+" "+fb7.numtostr(month2,"month"));}
if(toj==1){System.out.println("Return Travel Cost: Rs."+cost2);
System.out.println("Passenger cost for Adults and Children for return journey: Rs."+alacpc);}
System.out.println("Services Fee: Rs."+st);
System.out.println("GST: Rs."+gst);
double rr=Math.random()*18;
int r=(int)rr;
System.out.println(fb7.numtostr(arl,"airline")+" Discount: Rs."+discount[r]);
long oticketp=((acpc+ipc)-discount[r])+gst+st;
long rticketp=((alacpc+ipc)-discount[r])+gst+st;
System.out.println("Ticket cost(Inc.GST and Services Fee): Rs."+oticketp);
if(toj==1){System.out.println("Return ticket Cost(Inc.GST and Services Fee): Rs."+rticketp);}
if(toj==1){System.out.println("Total Travel Cost(Inc.Return journey cost): Rs."+(oticketp+rticketp));}
else{System.out.println("Total Travel Cost: Rs."+oticketp);}
System.out.println(hr);
System.out.println("Do you wish to again see Flight Ticket Price?");
loop=s7.next();
}
break;
default:
System.out.println("Wrong Option Selected! Please select the correct option!");
}
}
}
void IndiaTouristSpots()//9th Module:To Display India's Best tourist Spots
{
Scanner s9=new Scanner(System.in);
System.out.println("India's Best Tourist Spots...");
String loop="yes";int x=0;
String place=null,opt=null,des=null;
String loc[]={"null","Agra,Uttar Pradesh","New Delhi","Flows In Uttarakhand, Uttar Pradesh, Bihar, Jharkhand, and West Bengal","Amritsar,Punjab",
               "Jaipur,Rajasthan","New Delhi","Amer,Jaipur,Rajasthan","New Delhi","New Delhi","Jaipur,Rajasthan","Hyderabad,Telangana",
               "Andaman&Nicobar Islands"};
String op[]={"null","Taj Mahal","Red Fort","River Ganga","Golden Temple","Hawa Mahal","Qutb Minar","Amer Fort","Jama Masjid","Lotus Temple","Jantar Mantar","Charminar",
             "Havelock Island"};
String desp[]={"null","Taj Mahal is one of the most famous buildings in the world, the mausoleum of Shah Jahan’s wife,\nMumtaz Mahal. It is one of the New Seven Wonders of the world, and one of three World Heritage Sites in Agra.",
"The Red Fort Complex was built as the palace fort of Shahjahanabad – the new capital of the\nfifth Mughal Emperor of India, Shah Jahan, named for its massive enclosing walls of red sandstone",
"River Ganga is the longest river in India. It is sacred to Hindus. It is also a great\ndestination for tourism with opportunities like boating, rafting ,swimming ,watching\ndolphins and much more.",
"Sri Harmandir Sahib, also known as Golden Temple and the Darbar Sahib, is\nthe holiest Gurdwara and the most important pilgrimage site of Sikhism.",
"Hawa Mahal is a palace in Jaipur, India, so it is named because it was essentially a high screen wall built so that the women of the royal family could observe street festivals while unseen from the outside.",
"Qutub Minar is a minaret that forms part of the Qutb complex, a UNESCO World Heritage Site.\nIts construction was started by Qutub-ud-din Aibak and finished by Illtutmish.",
"Amer is a town with an area of 4 square kilometres located 11 kilometres from Jaipur,\nthe capital of Rajasthan. Located high on a hill, it is the principal tourist attraction in theJaipur area.",
"Jama Masjid was built by Mughal emperor Shah Jahan. The mosque was completed in 1656 AD\nwith three great gates, four towers and two 40 m high minarets constructed of strips of red\nsandstone and white marble. The courtyard can accommodate more than 25,000 persons.\nThere are three domes on the terrace which are surrounded by the two minarets.",
 "The Lotus Temple is a Bahá'í House of Worship that was dedicated in December 1986,\nhaving been completed for a total cost $10 million. It serves as the\nMother Temple of the Indian subcontinent.",
"Jantar Mantar is one of the popular place in India. The Jantar Mantar is\nan equinoctial sundial, consisting a gigantic triangular gnomon with the\nhypotenuse parallel to the Earth's axis.",
" Charminar is a historical place with mosque on top floor since 400 years and also\nfamous for its surrounding markets.It is one of the tourist attraction in hyderabad. Bangles can be\nfound at cheaper rate. Many local festivals are celebrated grandly\nin charminar like Ramzaan and other festivals",
"Havelock Island is known for its dive sites and beaches, like Elephant Beach, with\nits coral reefs. Crescent-shaped Radhanagar Beach is a popular spot for watching the sunset."};
while(loop.equals("yes"))
{
System.out.println("Press the corresponding Number to select your location and see its description...");
System.out.println("(1)-Taj Mahal    (2)-Red Fort       (3)-River Ganga   (4)-Golden Temple");
System.out.println("(5)-Hawa Mahal   (6)-Qutb Minar     (7)-Amer Fort     (8)-Jama Masjid");
System.out.println("(9)-Lotus Temple (10)-Jantar Mantar (11)-Charminar    (12)-Havelock Island");
x=s9.nextInt();
System.out.println(hr);
if(x>0&&x<13)
{
place=loc[x];
opt=op[x];
opt=opt.toUpperCase();
des=desp[x];
System.out.println("***"+opt+"***");
System.out.println("Location: "+place);
System.out.println("Description: "+des);
System.out.println(hr);
System.out.println("Do you want to see again the tourist spots?");
loop=s9.next();
}
else
{System.out.println("Wrong Choice! Please try Again!");}
}
}
}