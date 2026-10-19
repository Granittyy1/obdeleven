package p100i;

import C7.g;
import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.C0851d;
import androidx.appcompat.widget.C0853f;
import androidx.appcompat.widget.C0871y;
import androidx.collection.X;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: AppCompatViewInflater.java */
/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?>[] f36391b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f36392c = {R.attr.onClick};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f36393d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f36394e = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f36395f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f36396g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final X<String, Constructor<? extends View>> f36397h = new X<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f36398a = new Object[2];

    /* JADX INFO: compiled from: AppCompatViewInflater.java */
    public static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f36399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f36400c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Method f36401d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Context f36402e;

        public a(View view, String str) {
            this.f36399b = view;
            this.f36400c = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str;
            Method method;
            if (this.f36401d != null) {
                break;
            }
            View view2 = this.f36399b;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f36400c;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder sbA = g.a("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    sbA.append(view2.getClass());
                    sbA.append(str);
                    throw new IllegalStateException(sbA.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f36401d = method;
                        this.f36402e = context;
                        break;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            try {
                this.f36401d.invoke(this.f36402e, view);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    public C0851d a(Context context, AttributeSet attributeSet) {
        return new C0851d(context, attributeSet);
    }

    public C0853f b(Context context, AttributeSet attributeSet) {
        return new C0853f(context, attributeSet);
    }

    public AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    public AppCompatRadioButton d(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    public C0871y e(Context context, AttributeSet attributeSet) {
        return new C0871y(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) throws InflateException, ClassNotFoundException {
        String strConcat;
        X<String, Constructor<? extends View>> x10 = f36397h;
        Constructor<? extends View> constructor = x10.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f36391b);
            x10.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f36398a);
    }
}
