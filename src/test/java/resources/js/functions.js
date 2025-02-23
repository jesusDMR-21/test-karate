function fun (){
    return{
        modifiedResponse: function(rs){
            let arr = []
  
            rs.forEach(element => {
              let obj = {}
              obj.petId = element.id
              obj.petName = element.name
              arr.push(obj)
            });
            
            return arr
        },

        nameRepetitions: function contarRepeticiones(arr) {
            let petNames = {}        
  
            arr.forEach(name => {
              let petName = name
  
              if (petNames[petName]) petNames[petName] ++
              else petNames[petName] = 1
            });
  
            return petNames
    }
}
}