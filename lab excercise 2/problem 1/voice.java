class voice {
    
    void preparevoice(){
        Animal[] animal= new Animal[5];
        animal[0]=new cow();
        animal[1]=new pig();
        animal[2]=new goat();
        animal[3]=new lion();
        //animal[4]=new tiger();
        hear(animal);
        
        
        
    }
    public void hear(Animal animal[]){
        for(int i=0;i<5;i++){
            animal[i].makevoice();
            
        }
    }
    
    
    
}