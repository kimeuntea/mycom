package grade;

import java.util.Vector;

public class GradeServiceImpl implements GradeService {
	Vector<Object> vector = new Vector<Object>();
	GradeVO vo = new GradeVO();
    
	@Override
	public void input(GradeVO vo) {
		// TODO Auto-generated method stub
		vector.addElement(vo);

	}

	@Override
	public void print() {
		GradeVO[] gradeVO = new GradeVO[vector.size()];
		for (int i = 0; i < vector.size(); i++) {
			gradeVO[i] = (GradeVO) vector.elementAt(i);
		}
		for (int j = 0; j < gradeVO.length; j++) {
			System.out.println(gradeVO[j].toString() + "총점 :"
					+ gradeVO[j].getTotal());
		}

	}

	@Override
	public String searchByHak(String hak) {
		// TODO Auto-generated method stub
		int j = 0;
		/// vector 사이즈만큼 배열 크기
		GradeVO[] gradeVO = new GradeVO[vector.size()];
		// vector안에 정보 모두 vo 변수로 저장
		for (int i = 0; i < vector.size(); i++) {
			gradeVO[i] = (GradeVO) vector.get(i);
		}
		// 그런뒤 내가 찾는 학번가 일치할경우 j 로
		for (j = 0; j < gradeVO.length; j++) {
			if (gradeVO[j].getHak() == hak) {
				System.out.println(j);
				break;
			}
		}
		// 그런뒤 내가 찾는 학번가 일치할경우 j 로
		vo = (GradeVO) vector.elementAt(j);

		return vo.toString();
	}

	@Override
	public Vector<String> searchGradeByName(String name) {
		// TODO Auto-generated method stub
		Vector<String> vec = new Vector<String>();
		GradeVO[] gradeVO = new GradeVO[vector.size()];
		for (int i = 0; i < vector.size(); i++) {
			gradeVO[i] = (GradeVO) vector.elementAt(i);
		}
		for (int i = 0; i < gradeVO.length; i++) {
			if (gradeVO[i].getName() == name) {
				vec.removeAllElements();
				vec.add(gradeVO[i].toString());
				break;
			} else {
				vec.removeAllElements();
				vec.add("없습니다.");
			}
		}
		return vec;

	}

	@Override
	public void descGradeTotal() {
		// TODO Auto-generated method stub
		GradeVO temp = null;
		GradeVO[] gradeVO = new GradeVO[vector.size()];
		// vector안에 정보 모두 vo 변수로 저장
		for (int i = 0; i < vector.size(); i++) {
			gradeVO[i] = (GradeVO) vector.get(i);
		}
		for (int j = 0; j < vector.size(); j++) {
			for (int k = j + 1; k < gradeVO.length; k++) {
				if (gradeVO[j].getTotal() > gradeVO[k].getTotal()) {
					temp = gradeVO[j];
					gradeVO[j] = gradeVO[k];
					gradeVO[k] = temp;

				}
			}

		}
		System.out.println();
		for (int i = 0; i < gradeVO.length; i++) {
			System.out.println(gradeVO[i].toString());
		}
	}

	@Override
	public void ascGradeTotal() {
		// TODO Auto-generated method stub
		GradeVO temp = null;
		GradeVO[] gradeVO = new GradeVO[vector.size()];
		for (int i = 0; i < vector.size(); i++) {
			gradeVO[i] = (GradeVO) vector.get(i);
		}
		for (int j = 0; j < vector.size(); j++) {
			for (int k = j + 1; k > gradeVO.length; k++) {
				if (gradeVO[j].getTotal() > gradeVO[k].getTotal()) {
					temp = gradeVO[j];
					gradeVO[j] = gradeVO[k];
					gradeVO[k] = temp;

				}
			}

		}
		System.out.println();
		for (int i = 0; i < gradeVO.length; i++) {
			System.out.println(gradeVO[i].toString());
		}
	}
	}


