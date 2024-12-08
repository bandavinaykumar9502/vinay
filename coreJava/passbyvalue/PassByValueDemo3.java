class Company {
			int companyId;
			String compName;
			String location;
			int deptId;
			public Company() {	
			}
		}
		
		 class PassByValueDemo3 {
		
			void companyDetails(Company obj) {
				System.out.println(":2:companyDetails():companyId:"+obj.companyId+":compName:"+obj.compName);//1001 GratsIT
				obj = new Company();
				obj.companyId=2001;
				obj.compName="Infosys";
				System.out.println(":3:companyDetails():companyId:"+obj.companyId+":compName:"+obj.compName); //2001 Infosys

			}

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int companyId=1001;
				String compName="GratsIT";
				
				Company obj=new Company();
				
				obj.companyId=companyId;
				obj.compName=compName;
				
				System.out.println(":1:main():companyId:"+obj.companyId+":compName:"+obj.compName);//1001 GratsIT
				PassByValueDemo3 passByValObj = new PassByValueDemo3();
				passByValObj.companyDetails(obj);
				System.out.println(":4:main():companyId:"+obj.companyId+":compName:"+obj.compName); //1001 GratsIT 
			}
		}