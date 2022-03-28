function loaddoc() {
    var xhttp= new XMLHttpRequest();
      
    xhttp.onload= function() {
         let val =JSON.parse(this.responseText);
         let a= val.content;
         console.log(a);

          for(let i = 0;i< a.length;i++)
           {
             
              let empid=document.createElement("p")
              empid.innerHTML=a[i].empid;
              document.body.appendChild(empid)

             let firstname=document.createElement("p")
              firstname.innerHTML=a[i].firstname;
               document.body.appendChild(firstname)

              let last_name=document.createElement("P")
              last_name.innerHTML=a[i].lastname;
              document.body.appendChild(last_name)

              let street=document.createElement("p")
               street.innerHTML=a[i].street;
              document.body.appendChild(street);

              let city=document.createElement("p")
              city.innerHTML=a[i].city;
              document.body.appendChild(city);

              let state=document.createElement("p")
              state.innerHTML=a[i].state;
              document.body.appendChild(state);

              let siscode=document.createElement("p")
              siscode.innerHTML=a[i].siscode;
              document.body.appendChild(siscode);

              let birthdate=document.createElement("p")
              birthdate.innerHTML=a[i].birthdate;
              document.body.appendChild(birthdate);

              let img=document.createElement("img")
              img.src=a[i].picurl;
              document.body.appendChild(img);
          }    
         }
         xhttp.open('GET',"http:corridor.cloud.wavemakeronline.com/EmployeesAPI/services/HRAPI/Employee");
         xhttp.send();
    }   