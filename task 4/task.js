let fetchBtn = document.getElementById("fetchBtn");

		fetchBtn.addEventListener("click", buttonclickhandler);

		function buttonclickhandler() {
			const a = new XMLHttpRequest();

			a.open("GET",
                "https://reqres.in/api/users?page=1,", true);
			
			a.onload = function () 
            {
				if (this.status === 200) 
                {
					obj = JSON.parse(this.responseText);
                    console.log(obj.data);
                    let array= obj.data;
					let list = document.getElementById("list");
					str = ""
                    for (let index = 0; index < array.length; index++) 
                    {
                        const element = array[index];
                        const e = document.createElement("img");
                        e.className = "image"
                        e.src = element.avatar ;
                        document.body.appendChild(e);  
                        const c = document.createElement("p");
                        c.className = "id"
                        c.innerHTML = element.id ;
                        document.body.appendChild(c);
                        const d = document.createElement("p");
                        d.className = "email"
                        d.innerHTML = element.email ;
                        document.body.appendChild(d);
                        const a = document.createElement("p");
                        a.className = "first"
                        a.innerHTML = element.first_name ;
                        document.body.appendChild(a);
                        const b = document.createElement("p");
                        b.className = "last"
                        b.innerHTML = element.last_name ;
                        document.body.appendChild(b);
                    }  
				}
				else {
					console.log("File not found");
				}
			}
			a.send();
		}