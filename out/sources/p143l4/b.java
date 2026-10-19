package p143l4;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import io.intercom.android.sdk.models.AttributeType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.l;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p043d4.c;

/* JADX INFO: compiled from: SuggestedEventViewHierarchy.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<Class<? extends View>> f44359a = l.s(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);

    public static final ArrayList a(View view) {
        i.e(view, "view");
        ArrayList arrayList = new ArrayList();
        Iterator<Class<? extends View>> it = f44359a.iterator();
        while (it.hasNext()) {
            if (it.next().isInstance(view)) {
                return arrayList;
            }
        }
        if (view.isClickable()) {
            arrayList.add(view);
        }
        Iterator it2 = c.a(view).iterator();
        while (it2.hasNext()) {
            arrayList.addAll(a((View) it2.next()));
        }
        return arrayList;
    }

    public static final JSONObject b(View view, View view2) {
        i.e(view, "view");
        JSONObject jSONObject = new JSONObject();
        if (view == view2) {
            try {
                jSONObject.put("is_interacted", true);
            } catch (JSONException unused) {
            }
        }
        e(view, jSONObject);
        JSONArray jSONArray = new JSONArray();
        Iterator it = c.a(view).iterator();
        while (it.hasNext()) {
            jSONArray.put(b((View) it.next(), view2));
        }
        jSONObject.put("childviews", jSONArray);
        return jSONObject;
    }

    public static ArrayList c(View view) {
        ArrayList arrayList = new ArrayList();
        for (View view2 : c.a(view)) {
            String strH = c.h(view2);
            if (strH.length() > 0) {
                arrayList.add(strH);
            }
            arrayList.addAll(c(view2));
        }
        return arrayList;
    }

    public static final String d(View hostView) {
        i.e(hostView, "hostView");
        String strH = c.h(hostView);
        if (strH.length() > 0) {
            return strH;
        }
        String strJoin = TextUtils.join(" ", c(hostView));
        i.d(strJoin, "join(\" \", childrenText)");
        return strJoin;
    }

    public static final void e(View view, JSONObject jSONObject) {
        i.e(view, "view");
        try {
            String strH = c.h(view);
            String strG = c.g(view);
            jSONObject.put("classname", view.getClass().getSimpleName());
            jSONObject.put("classtypebitmask", c.b(view));
            if (strH.length() > 0) {
                jSONObject.put(AttributeType.TEXT, strH);
            }
            if (strG.length() > 0) {
                jSONObject.put("hint", strG);
            }
            if (view instanceof EditText) {
                jSONObject.put("inputtype", ((EditText) view).getInputType());
            }
        } catch (JSONException unused) {
        }
    }
}
