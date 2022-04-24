class UndergroundSystem {
   ArrayList<Time> timetable=new ArrayList<>();
class Cin{
    
    int id;
    String ss;
    int st;
    String es;
    int et;
    Cin(int i,String s,int time)
        {
        
        id=i;
        ss=s;
        st=time;
        }
    public void cout(String es,int et)
        {
        this.es=es; this.et=et;
        Time t1 = new Time(ss,es,et-st);
        timetable.add(t1);
        et=0; st=0;
        ss="";
        es="";

       
        }

    } 
   class Time 
       {
       String sname;
       String dname;
       int time;
       Time(String snae,String dnam,int t)
           {
           sname=snae;
           dname=dnam;
           time=t;
           
        }
       
       
       
       }
 ArrayList<Cin> a =new ArrayList<>();

    public UndergroundSystem() {
        
    }
    
    public void checkIn(int id, String sname, int t) {
        if(valid(id,t)){
        Cin c= new Cin(id,sname,t);
            a.add(c);
            
            }
        
    }
    
    public void checkOut(int id, String stationName, int t) {
        for(Cin c : a)
            {
            
            if(c.id==id)
                c.cout(stationName,t);
            
            
            }
    }
    
    public double getAverageTime(String station, String estation) {
        double avg=0;

            int c=0;
        for(Time t:timetable)
            {
            
            if((t.sname).equals(station) && (t.dname).equals(estation))
                {
                avg+=t.time;
                c++;
                
                }
            
            } 
        if(c==0)
            return 0;
        return avg/c;
    } 
    public boolean valid(int id,int t)
        {
         int l=a.size();
         for(Cin v :a)
             {
             
             if(v.id==id && t==v.st)
                 return false;
             
             
             
             }
        return true;
         
            
            
           
        
        }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
