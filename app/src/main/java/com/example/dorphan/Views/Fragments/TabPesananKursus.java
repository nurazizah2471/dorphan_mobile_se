package com.example.dorphan.Views.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.dorphan.Helpers.SharedPreferenceHelper;
import com.example.dorphan.R;
import com.example.dorphan.ViewModels.CourseBookingViewModel;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TabPesananKursus#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TabPesananKursus extends Fragment {


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TabPesananKursus() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TabPesananKursus.
     */
    // TODO: Rename and change types and number of parameters
    public static TabPesananKursus newInstance(String param1, String param2) {
        TabPesananKursus fragment = new TabPesananKursus();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab_pesanan_kursus, container, false);
    }


    private CourseBookingViewModel courseBookingViewModel;
    private SharedPreferenceHelper helper;
    private TextView txt_nama_panti1_tab_pesanan_kursus_fragment_panti, txt_kategori_panti1_tab_pesanan_kursus_fragment_panti,
            txt_money1_tab_pesanan_kursus_fragment_panti, txt_time1_tab_pesanan_kursus_fragment_panti, txt_date1_tab_pesanan_kursus_fragment_panti,
            txt_nama_panti2_tab_pesanan_kursus_fragment_panti, txt_kategori_panti2_tab_pesanan_kursus_fragment_panti, txt_money2_tab_pesanan_kursus_fragment_panti,
            txt_time2_tab_pesanan_kursus_fragment_panti, txt_date2_tab_pesanan_kursus_fragment_panti, txt_nama_panti3_tab_pesanan_kursus_fragment_panti, txt_kategori_panti3_tab_pesanan_kursus_fragment_panti,
            txt_money3_tab_pesanan_kursus_fragment_panti, txt_time3_tab_pesanan_kursus_fragment_panti, txt_date3_tab_pesanan_kursus_fragment_panti;

    private Button btn_batal1_tab_pesanan_kursus_fragment_panti, btn_batal2_tab_pesanan_kursus_fragment_panti, btn_batal3_tab_pesanan_kursus_fragment_panti;



    private CardView cv1_tab_pesanan_kursus_fragment_panti, cv2_tab_pesanan_kursus_fragment_panti, cv3_tab_pesanan_kursus_fragment_panti;

    private void initial() {

        cv1_tab_pesanan_kursus_fragment_panti= getActivity().findViewById(R.id.cv1_tab_pesanan_kursus_fragment_panti); //kenapa null?
        cv2_tab_pesanan_kursus_fragment_panti= getActivity().findViewById(R.id.cv2_tab_pesanan_kursus_fragment_panti);
        cv3_tab_pesanan_kursus_fragment_panti= getActivity().findViewById(R.id.cv3_tab_pesanan_kursus_fragment_panti);
        txt_nama_panti1_tab_pesanan_kursus_fragment_panti = getActivity().findViewById(R.id.txt_nama_panti1_tab_pesanan_kursus_fragment_panti);
        txt_kategori_panti1_tab_pesanan_kursus_fragment_panti = getActivity().findViewById(R.id.txt_kategori_panti1_tab_pesanan_kursus_fragment_panti);
        txt_money1_tab_pesanan_kursus_fragment_panti = getActivity().findViewById(R.id.txt_money1_tab_pesanan_kursus_fragment_panti);
        txt_time1_tab_pesanan_kursus_fragment_panti = getActivity().findViewById(R.id.txt_time1_tab_pesanan_kursus_fragment_panti);
        txt_date1_tab_pesanan_kursus_fragment_panti = getActivity().findViewById(R.id.txt_date1_tab_pesanan_kursus_fragment_panti);
        txt_nama_panti2_tab_pesanan_kursus_fragment_panti = getActivity().findViewById(R.id.txt_nama_panti2_tab_pesanan_kursus_fragment_panti);
        txt_kategori_panti2_tab_pesanan_kursus_fragment_panti = getActivity().findViewById(R.id.txt_kategori_panti2_tab_pesanan_kursus_fragment_panti);
        txt_money2_tab_pesanan_kursus_fragment_panti = getActivity().findViewById(R.id.txt_money2_tab_pesanan_kursus_fragment_panti);
        txt_time2_tab_pesanan_kursus_fragment_panti = getActivity().findViewById(R.id.txt_time2_tab_pesanan_kursus_fragment_panti);
        txt_date2_tab_pesanan_kursus_fragment_panti = getActivity().findViewById(R.id.txt_date2_tab_pesanan_kursus_fragment_panti);
        txt_nama_panti3_tab_pesanan_kursus_fragment_panti = getActivity().findViewById(R.id.txt_nama_panti3_tab_pesanan_kursus_fragment_panti);
        txt_kategori_panti3_tab_pesanan_kursus_fragment_panti = getActivity().findViewById(R.id.txt_kategori_panti3_tab_pesanan_kursus_fragment_panti);
        txt_money3_tab_pesanan_kursus_fragment_panti = getActivity().findViewById(R.id.txt_money3_tab_pesanan_kursus_fragment_panti);
        txt_time3_tab_pesanan_kursus_fragment_panti = getActivity().findViewById(R.id.txt_time3_tab_pesanan_kursus_fragment_panti);
        txt_date3_tab_pesanan_kursus_fragment_panti = getActivity().findViewById(R.id.txt_date3_tab_pesanan_kursus_fragment_panti);

        helper = SharedPreferenceHelper.getInstance(requireActivity());
        courseBookingViewModel = new ViewModelProvider(getActivity()).get(CourseBookingViewModel.class);
    }


    @Override

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        initial();
//        cv2_tab_pesanan_kursus_fragment_panti.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Navigation.findNavController(view).navigate(R.id.action_cariTutorFragment_to_courseBookingFragment);
//
//            }
//        });
//        cv1_tab_pesanan_kursus_fragment_panti.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Navigation.findNavController(view).navigate(R.id.action_cariTutorFragment_to_courseBookingFragment);
//
//            }
//        });
//        cv3_tab_pesanan_kursus_fragment_panti.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Navigation.findNavController(view).navigate(R.id.action_cariTutorFragment_to_courseBookingFragment);
//
//            }
//        });

    }

    private void initial2() {}

    @Override
    public void onDetach() {
        super.onDetach();
        getActivity().getViewModelStore().clear();
    }
}