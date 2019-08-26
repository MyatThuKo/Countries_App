package com.example.countriesapp.viewmodel;

import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.countriesapp.model.CountryModel;

import java.util.ArrayList;
import java.util.List;

public class ListViewModel extends ViewModel {

    public MutableLiveData<List<CountryModel>> countries = new MutableLiveData<List<CountryModel>>();
    public MutableLiveData<Boolean> countryLoadError = new MutableLiveData<Boolean>();
    public MutableLiveData<Boolean> loading = new MediatorLiveData<Boolean>();

    public void refresh() {
        fetchCountries();
    }

    private void fetchCountries() {
        CountryModel country1 = new CountryModel("Myanmar", "Yangon", " ");
        CountryModel country2 = new CountryModel("England", "London", " ");
        CountryModel country3 = new CountryModel("USA", "Washington D.C", " ");
        CountryModel country4 = new CountryModel("France", "Paris", " ");


        List<CountryModel> list = new ArrayList<CountryModel>();
        list.add(country1);
        list.add(country2);
        list.add(country3);
        list.add(country4);
        list.add(country1);
        list.add(country2);
        list.add(country3);
        list.add(country4);

        countries.setValue(list);
        countryLoadError.setValue(false);
        loading.setValue(false);
    }
}
