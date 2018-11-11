package androidworks.bsrakdg.com.databindingobservablefieldapp.model;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;

public class User {

    /* If your object class has fewer properties to be updated or if you don’t want to observe
    every field in the object, you can use ObservableFields to update the UI. */
    public static ObservableField<String> name = new ObservableField<>();
    public static ObservableField<String> email = new ObservableField<>();

    public static ObservableBoolean isEngineer = new ObservableBoolean();
    public static ObservableBoolean isDeveloper = new ObservableBoolean(){

        @Override
        public void set(boolean value) {
            if (value){
                isEngineer.set(value);
            }
            super.set(value);
        }
    };

    public static ObservableField<String> getName() {
        return name;
    }

    public static ObservableField<String> getEmail() {
        return email;
    }

    public static ObservableBoolean getIsDeveloper() {
        return isDeveloper;
    }

    public static ObservableBoolean getIsEngineer() {
        return isEngineer;
    }

}
