package br.com.s2it.prova.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import br.com.s2it.prova.model.Nf;

@Repository
public class NfRepository extends AbstractRepository{

	@SuppressWarnings("unchecked")
	public List<Nf> listAll() {
		Criteria criteria = getSession().createCriteria(Nf.class);
        return criteria.list();
	}

	@Override
	public Object findById(int id) {
		Criteria criteria = getSession().createCriteria(Nf.class);
        criteria.add(Restrictions.eq("id",id));
        return criteria.uniqueResult();
	}
	
	
}
