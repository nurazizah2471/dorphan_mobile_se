//package com.example.dorphan.ViewModels;
//
//import android.app.Application;
//
//import androidx.lifecycle.AndroidViewModel;
//import androidx.lifecycle.LiveData;
//import androidx.lifecycle.MutableLiveData;
//
//import com.example.dorphan.Repositories.CourseBookingRepository;
//
//import java.util.List;
//
//public class CourseBookingViewModel extends AndroidViewModel {
//
//    private CourseBookingRepository courseBookingRepository;
//
//    public CourseBookingViewModel(Application application) {
//        super(application);
//    }
//
//    public void init(String token) {
//        courseBookingRepository = CourseBookingRepository.getInstance(token);
//    }
//
//    private MutableLiveData<List<CourseBooking.Result>> resultGetCourseBooking = new MutableLiveData<>();
//    public void getCourseBooking(String user_id){
//        resultGetCourseBooking = courseBookingRepository.getCourseBooking(user_id);
//    }
//    public LiveData<List<CourseBooking.Result>> getResultGetCourseBooking(){
//        return resultGetCourseBooking;
//    }
//
//    @Override
//    protected void onCleared() {
//        super.onCleared();
//        courseBookingRepository.resetInstance();
//    }
//}
