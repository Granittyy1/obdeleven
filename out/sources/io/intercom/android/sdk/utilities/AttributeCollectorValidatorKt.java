package io.intercom.android.sdk.utilities;

import android.content.res.Resources;
import io.intercom.android.sdk.R;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: AttributeCollectorValidator.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AttributeCollectorValidatorKt {
    public static final String getErrorStringFromCode(Resources resources, int i10) {
        i.e(resources, "<this>");
        switch (i10) {
            case 1:
                String string = resources.getString(R.string.intercom_string_is_incorrect);
                i.d(string, "getString(...)");
                return string;
            case 2:
                String string2 = resources.getString(R.string.intercom_that_email_address_doesnt_look_quite_right);
                i.d(string2, "getString(...)");
                return string2;
            case 3:
                String string3 = resources.getString(R.string.intercom_that_number_doesnt_look_quite_right);
                i.d(string3, "getString(...)");
                return string3;
            case 4:
                String string4 = resources.getString(R.string.intercom_that_number_needs_a_prefix);
                i.d(string4, "getString(...)");
                return string4;
            case 5:
                String string5 = resources.getString(R.string.intercom_that_number_has_too_many_digits);
                i.d(string5, "getString(...)");
                return string5;
            case 6:
                String string6 = resources.getString(R.string.intercom_that_country_code_doesnt_look_quite_right);
                i.d(string6, "getString(...)");
                return string6;
            case 7:
                String string7 = resources.getString(R.string.intercom_that_number_is_missing_a_few_digits);
                i.d(string7, "getString(...)");
                return string7;
            default:
                return "";
        }
    }
}
