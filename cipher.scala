object cipher{
	val str="UCSC"
	
	val alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	
	val Enc=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)+key)%a.size)
	val Dec=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)-key)%a.size)
	
	val cipher=(algo:(Char,Int,String)=> Char,str:String,key:Int,a:String)=> str.map(algo(_,key,a))
	
	val ct=cipher(Enc,str,5,alphabet)
	val pt=cipher(Dec,ct,5,alphabet)
	
	def main(args: Array[String])={
		println("Text :"+str)
		println("Encrypted :"+ct)
		println("Decrypted :"+pt)
	}
}