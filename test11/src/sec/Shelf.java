package sec;


import java.util.ArrayList;


public class Shelf {
		protected ArrayList<String> Shelf;
		public Shelf()	{
				Shelf = new ArrayList<String>();
		}
		public ArrayList<String> getShelf() {
			return Shelf;
		}
		public void setShelf(ArrayList<String> shelf) {
			Shelf = shelf;
		}

		public int getCount() {
					return Shelf.size();
			
		}
}
