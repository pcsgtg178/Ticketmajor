public class huneymoonprice extends pricegeneral implements pricespecial{

	@Override
	public int Mgen(int nums) {
		// TODO Auto-generated method stub
		return 180+(200*(nums-1));
	}

	@Override
	int calpriceg(int numg) {
		// TODO Auto-generated method stub
		return 200*numg;
	}

}
