public class ObecnoscWLancuchu {
   static void Ilerazy(char a, String napis)
   {
       int liczbaWsytapien=0;
       char tablicaNapis [] = new char [napis.length()];
       tablicaNapis= napis.toCharArray();
       for(int i=0;i<napis.length();i++)
       {
           if(tablicaNapis[i]==a)
           {
               liczbaWsytapien++;
           }
       }
       if(liczbaWsytapien!=0)
       { System.out.println("Znak "+ a + " wystepuje w podanym lancuchu "+ liczbaWsytapien + " razy");}
       if(liczbaWsytapien==0)
       {
           System.out.println("Znak nie wystepuje w lancuchu");
       }
   }
}
