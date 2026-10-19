package p030c4;

import E7.d;
import Z3.q;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.facebook.appevents.codeless.internal.EventBinding;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.i;
import p043d4.c;

/* JADX INFO: compiled from: CodelessLoggingEventListener.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CodelessLoggingEventListener.kt */
    public static final class ViewOnClickListenerC0236a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public EventBinding f22290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public WeakReference<View> f22291c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public WeakReference<View> f22292d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public View.OnClickListener f22293e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f22294f;

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            i.e(view, "view");
            View.OnClickListener onClickListener = this.f22293e;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            View view2 = this.f22292d.get();
            View view3 = this.f22291c.get();
            if (view2 == null || view3 == null) {
                return;
            }
            a.a(this.f22290b, view2, view3);
        }
    }

    /* JADX INFO: compiled from: CodelessLoggingEventListener.kt */
    public static final class b implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public EventBinding f22295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public WeakReference<AdapterView<?>> f22296c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public WeakReference<View> f22297d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public AdapterView.OnItemClickListener f22298e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f22299f;

        public b() {
            throw null;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j) {
            i.e(view, "view");
            AdapterView.OnItemClickListener onItemClickListener = this.f22298e;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i10, j);
            }
            View view2 = this.f22297d.get();
            AdapterView<?> adapterView2 = this.f22296c.get();
            if (view2 == null || adapterView2 == null) {
                return;
            }
            a.a(this.f22295b, view2, adapterView2);
        }
    }

    public static final void a(EventBinding mapping, View view, View view2) {
        Locale locale;
        i.e(mapping, "mapping");
        Bundle bundle = new Bundle();
        List<p043d4.a> listUnmodifiableList = Collections.unmodifiableList(mapping.f24919c);
        i.d(listUnmodifiableList, "unmodifiableList(parameters)");
        for (p043d4.a aVar : listUnmodifiableList) {
            String str = aVar.f34556b;
            String str2 = aVar.f34555a;
            if (str == null || str.length() <= 0) {
                ArrayList arrayList = aVar.f34557c;
                if (arrayList.size() > 0) {
                    for (c.b bVar : i.a(aVar.f34558d, "relative") ? c.ViewTreeObserverOnGlobalLayoutListenerC0237c.a.a(view2, arrayList, 0, -1, view2.getClass().getSimpleName()) : c.ViewTreeObserverOnGlobalLayoutListenerC0237c.a.a(view, arrayList, 0, -1, view.getClass().getSimpleName())) {
                        if (bVar.a() != null) {
                            c cVar = c.f34562a;
                            String strH = c.h(bVar.a());
                            if (strH.length() > 0) {
                                bundle.putString(str2, strH);
                                break;
                            }
                        }
                    }
                }
            } else {
                bundle.putString(str2, aVar.f34556b);
            }
        }
        String string = bundle.getString("_valueToSum");
        if (string != null) {
            double dDoubleValue = 0.0d;
            try {
                Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(string);
                if (matcher.find()) {
                    String strGroup = matcher.group(0);
                    try {
                        locale = q.a().getResources().getConfiguration().locale;
                    } catch (Exception unused) {
                        locale = null;
                    }
                    if (locale == null) {
                        locale = Locale.getDefault();
                        i.d(locale, "getDefault()");
                    }
                    dDoubleValue = NumberFormat.getNumberInstance(locale).parse(strGroup).doubleValue();
                }
            } catch (ParseException unused2) {
            }
            bundle.putDouble("_valueToSum", dDoubleValue);
        }
        bundle.putString("_is_fb_codeless", "1");
        q.c().execute(new d(mapping.f24917a, 3, bundle));
    }
}
