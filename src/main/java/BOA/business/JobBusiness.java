package BOA.business;

import BOA.dao.JobDao;
import BOA.entity.Job;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

@Stateless
public class JobBusiness {

    @Inject
    private JobDao jobDao;

    public Optional<Job> findById( Job job){

        return jobDao.findById(job);
    }

    public Optional<Job> findById( Long id){

        return jobDao.findById(Job.build(id));
    }

    public List<Job> findAll(){
        return jobDao.findAll();
    }

    public Job save (Job job){

        return jobDao.save(job);
    }

}
