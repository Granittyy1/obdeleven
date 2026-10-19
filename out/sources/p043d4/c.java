package p043d4;

import Z3.q;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.core.view.InterfaceC1304t;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p165n4.s;

/* JADX INFO: compiled from: ViewHierarchy.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f34562a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f34563b = c.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static WeakReference<View> f34564c = new WeakReference<>(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f34565d;

    public static final ArrayList a(View view) {
        ViewGroup viewGroup;
        int childCount;
        ArrayList arrayList = new ArrayList();
        if ((view instanceof ViewGroup) && (childCount = (viewGroup = (ViewGroup) view).getChildCount()) > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                arrayList.add(viewGroup.getChildAt(i10));
                if (i11 >= childCount) {
                    break;
                }
                i10 = i11;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003e  */
    /* JADX WARN: Code duplicated, block: B:35:0x005c A[PHI: r1
      0x005c: PHI (r1v12 int) = (r1v11 int), (r1v13 int) binds: [B:28:0x0048, B:33:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    public static final int b(View view) {
        int i10;
        Class<?> cls;
        i.e(view, "view");
        int i11 = view instanceof ImageView ? 2 : 0;
        if (view.isClickable()) {
            i11 |= 32;
        }
        ViewParent parent = view.getParent();
        boolean z10 = parent instanceof AdapterView;
        c cVar = f34562a;
        if (z10) {
            i11 |= 512;
        } else {
            cVar.getClass();
            try {
                cls = Class.forName("android.support.v4.view.NestedScrollingChild");
            } catch (ClassNotFoundException unused) {
                cls = null;
            }
            if ((cls != null && cls.isInstance(parent)) || (InterfaceC1304t.class != 0 && InterfaceC1304t.class.isInstance(parent))) {
                i11 |= 512;
            }
        }
        if (view instanceof TextView) {
            int i12 = i11 | 1025;
            if (view instanceof Button) {
                i12 = i11 | 1029;
                if (view instanceof Switch) {
                    i10 = i11 | 9221;
                } else if (view instanceof CheckBox) {
                    i10 = i11 | 33797;
                } else {
                    i10 = i12;
                }
            } else {
                i10 = i12;
            }
            return view instanceof EditText ? i10 | 2048 : i10;
        }
        if ((view instanceof Spinner) || (view instanceof DatePicker)) {
            return i11 | 4096;
        }
        if (view instanceof RatingBar) {
            return i11 | 65536;
        }
        if (view instanceof RadioGroup) {
            return i11 | 16384;
        }
        if (!(view instanceof ViewGroup)) {
            return i11;
        }
        View view2 = f34564c.get();
        cVar.getClass();
        return i(view, view2) ? i11 | 64 : i11;
    }

    public static final JSONObject c(View view) {
        i.e(view, "view");
        if (view.getClass().getName().equals("com.facebook.react.ReactRootView")) {
            f34564c = new WeakReference<>(view);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            j(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayListA = a(view);
            int size = arrayListA.size() - 1;
            if (size >= 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    jSONArray.put(c((View) arrayListA.get(i10)));
                    if (i11 > size) {
                        break;
                    }
                    i10 = i11;
                }
            }
            jSONObject.put("childviews", jSONArray);
        } catch (JSONException e10) {
            Log.e(f34563b, "Failed to create JSONObject for view.", e10);
        }
        return jSONObject;
    }

    public static JSONObject d(View view) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(VerticalAlignment.TOP, view.getTop());
            jSONObject.put(BlockAlignment.LEFT, view.getLeft());
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            jSONObject.put("scrollx", view.getScrollX());
            jSONObject.put("scrolly", view.getScrollY());
            jSONObject.put("visibility", view.getVisibility());
        } catch (JSONException e10) {
            Log.e(f34563b, "Failed to create JSONObject for dimension.", e10);
        }
        return jSONObject;
    }

    public static final View.OnClickListener e(View view) {
        Field declaredField;
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            if (obj2 != null) {
                return (View.OnClickListener) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnClickListener");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        }
    }

    public static final View.OnTouchListener f(View view) {
        Field declaredField;
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            if (obj2 != null) {
                return (View.OnTouchListener) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnTouchListener");
        } catch (ClassNotFoundException unused) {
            q qVar = q.f7852a;
            return null;
        } catch (IllegalAccessException unused2) {
            q qVar2 = q.f7852a;
            return null;
        } catch (NoSuchFieldException unused3) {
            q qVar3 = q.f7852a;
            return null;
        }
    }

    public static final String g(View view) {
        CharSequence hint;
        String string;
        if (view instanceof EditText) {
            hint = ((EditText) view).getHint();
        } else {
            hint = view instanceof TextView ? ((TextView) view).getHint() : null;
        }
        return (hint == null || (string = hint.toString()) == null) ? "" : string;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00da A[EDGE_INSN: B:40:0x00da->B:41:0x00db BREAK  A[LOOP:0: B:29:0x00af->B:36:0x00c9]] */
    public static final String h(View view) {
        CharSequence charSequenceValueOf;
        Object selectedItem;
        String string;
        if (!(view instanceof TextView)) {
            if (!(view instanceof Spinner)) {
                if (!(view instanceof DatePicker)) {
                    if (!(view instanceof TimePicker)) {
                        if (!(view instanceof RadioGroup)) {
                            if (!(view instanceof RatingBar)) {
                                charSequenceValueOf = null;
                                break;
                            }
                            charSequenceValueOf = String.valueOf(((RatingBar) view).getRating());
                        } else {
                            RadioGroup radioGroup = (RadioGroup) view;
                            int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                            int childCount = radioGroup.getChildCount();
                            if (childCount <= 0) {
                                charSequenceValueOf = null;
                                break;
                            }
                            int i10 = 0;
                            while (true) {
                                int i11 = i10 + 1;
                                View childAt = radioGroup.getChildAt(i10);
                                if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                                    charSequenceValueOf = ((RadioButton) childAt).getText();
                                    break;
                                }
                                if (i11 >= childCount) {
                                    charSequenceValueOf = null;
                                    break;
                                }
                                i10 = i11;
                            }
                        }
                    } else {
                        TimePicker timePicker = (TimePicker) view;
                        Integer currentHour = timePicker.getCurrentHour();
                        i.d(currentHour, "view.currentHour");
                        int iIntValue = currentHour.intValue();
                        Integer currentMinute = timePicker.getCurrentMinute();
                        i.d(currentMinute, "view.currentMinute");
                        charSequenceValueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(currentMinute.intValue())}, 2));
                    }
                } else {
                    DatePicker datePicker = (DatePicker) view;
                    charSequenceValueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(datePicker.getYear()), Integer.valueOf(datePicker.getMonth()), Integer.valueOf(datePicker.getDayOfMonth())}, 3));
                }
            } else {
                Spinner spinner = (Spinner) view;
                if (spinner.getCount() <= 0 || (selectedItem = spinner.getSelectedItem()) == null) {
                    charSequenceValueOf = null;
                    break;
                }
                charSequenceValueOf = selectedItem.toString();
            }
        } else {
            charSequenceValueOf = ((TextView) view).getText();
            if (view instanceof Switch) {
                charSequenceValueOf = ((Switch) view).isChecked() ? "1" : "0";
            }
        }
        return (charSequenceValueOf == null || (string = charSequenceValueOf.toString()) == null) ? "" : string;
    }

    public static boolean i(View view, View view2) {
        i.e(view, "view");
        if (!view.getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup")) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        float[] fArr = {iArr[0], iArr[1]};
        if (f34565d == null) {
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                f34565d = declaredMethod;
                if (declaredMethod == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException unused) {
                q qVar = q.f7852a;
            } catch (NoSuchMethodException unused2) {
                q qVar2 = q.f7852a;
            }
        }
        Method method = f34565d;
        View view3 = null;
        if (method != null && view2 != null) {
            try {
                Object objInvoke = method.invoke(null, fArr, view2);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                }
                View view4 = (View) objInvoke;
                if (view4.getId() > 0) {
                    Object parent = view4.getParent();
                    if (parent == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                    }
                    view3 = (View) parent;
                }
            } catch (IllegalAccessException unused3) {
                q qVar3 = q.f7852a;
            } catch (InvocationTargetException unused4) {
                q qVar4 = q.f7852a;
            }
        }
        return view3 != null && view3.getId() == view.getId();
    }

    public static final void j(View view, JSONObject jSONObject) {
        i.e(view, "view");
        try {
            String strH = h(view);
            String strG = g(view);
            Object tag = view.getTag();
            CharSequence contentDescription = view.getContentDescription();
            jSONObject.put("classname", view.getClass().getCanonicalName());
            jSONObject.put("classtypebitmask", b(view));
            jSONObject.put("id", view.getId());
            if (M1.j(view)) {
                jSONObject.put(AttributeType.TEXT, "");
                jSONObject.put("is_user_input", true);
            } else {
                jSONObject.put(AttributeType.TEXT, s.f(s.H(strH)));
            }
            jSONObject.put("hint", s.f(s.H(strG)));
            if (tag != null) {
                jSONObject.put("tag", s.f(s.H(tag.toString())));
            }
            if (contentDescription != null) {
                jSONObject.put("description", s.f(s.H(contentDescription.toString())));
            }
            f34562a.getClass();
            jSONObject.put("dimension", d(view));
        } catch (JSONException unused) {
            q qVar = q.f7852a;
        }
    }
}
