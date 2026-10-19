package p122j9;

import C4.b;
import O.e;
import W7.c;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.foundation.C0936h;
import androidx.recyclerview.widget.RecyclerView;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.exception.FaultException;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.fault.Fault;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import com.voltasit.obdeleven.core.app.C2092g;
import com.voltasit.obdeleven.core.app.C2097l;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import com.voltasit.obdeleven.utils.bluetooth.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;
import p134k8.T1;
import p220r9.P;
import p255u9.E;

/* JADX INFO: compiled from: FaultsAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends RecyclerView.Adapter<ViewOnClickListenerC0470a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MainActivity f41159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E f41160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DatabaseLanguage f41161e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f41163g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f41157a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f41158b = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f41162f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f41164h = KoinJavaComponent.b(J8.a.class, null, null);

    /* JADX INFO: renamed from: j9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FaultsAdapter.java */
    public class ViewOnClickListenerC0470a extends RecyclerView.B implements View.OnClickListener, View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f41165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f41166c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImageView f41167d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final View f41168e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final LinearLayout f41169f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final LinearLayout f41170g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final LinearLayout f41171h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final ProgressBar f41172i;

        public ViewOnClickListenerC0470a(View view) {
            super(view);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.title);
            this.f41165b = (TextView) view.findViewById(R.id.value);
            this.f41166c = (TextView) view.findViewById(R.id.status);
            ImageView imageView = (ImageView) view.findViewById(R.id.google);
            this.f41167d = imageView;
            this.f41168e = view.findViewById(R.id.status_bar);
            this.f41169f = (LinearLayout) view.findViewById(R.id.freeze_frame);
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.faultCode);
            this.f41170g = linearLayout2;
            LinearLayout linearLayout3 = (LinearLayout) view.findViewById(R.id.faultStatus);
            this.f41171h = linearLayout3;
            this.f41172i = (ProgressBar) view.findViewById(R.id.progress);
            linearLayout.setOnClickListener(this);
            imageView.setOnClickListener(this);
            linearLayout2.setOnLongClickListener(this);
            linearLayout3.setOnLongClickListener(this);
        }

        public final void a(p181o8.a aVar) {
            List<T1> arrayList = new ArrayList<>();
            if (aVar != null) {
                arrayList = aVar.a();
                UserTrackingUtils.c(UserTrackingUtils.Key.f34274s, 1);
            }
            boolean zIsEmpty = arrayList.isEmpty();
            LinearLayout linearLayout = this.f41171h;
            a aVar2 = a.this;
            if (zIsEmpty) {
                linearLayout.setBackground(aVar2.f41159c.getResources().getDrawable(R.drawable.content_button_bottom_selector));
            } else {
                linearLayout.setBackground(aVar2.f41159c.getResources().getDrawable(R.drawable.content_button_selector));
            }
            LinearLayout linearLayout2 = this.f41169f;
            int childCount = (linearLayout2.getChildCount() - 3) / 2;
            if (childCount > arrayList.size()) {
                int size = (arrayList.size() * 2) + 3;
                linearLayout2.removeViews(size, ((childCount * 2) + 3) - size);
            } else if (childCount < arrayList.size()) {
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(aVar2.f41159c);
                while (childCount < arrayList.size()) {
                    layoutInflaterFrom.inflate(R.layout.item_button_divider, (ViewGroup) linearLayout2, true);
                    if (childCount == arrayList.size() - 1) {
                        layoutInflaterFrom.inflate(R.layout.item_labeled_button_bottom, (ViewGroup) linearLayout2, true);
                    } else {
                        layoutInflaterFrom.inflate(R.layout.item_labeled_button, (ViewGroup) linearLayout2, true);
                    }
                    childCount++;
                }
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                T1 t8 = arrayList.get(i10);
                String str = t8.f42678a;
                String strF = t8.f42679b;
                String str2 = t8.f42680c;
                LinearLayout linearLayout3 = (LinearLayout) linearLayout2.getChildAt((i10 * 2) + 4);
                TextView textView = (TextView) linearLayout3.getChildAt(0);
                TextView textView2 = (TextView) linearLayout3.getChildAt(1);
                textView.setText(str);
                if (str2 != null && !str2.isEmpty()) {
                    strF = O.a.f(strF, " ", str2);
                }
                textView2.setText(strF);
                linearLayout3.setOnLongClickListener(this);
            }
        }

        /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, xa.g] */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int adapterPosition = getAdapterPosition();
            if (adapterPosition == -1) {
                return;
            }
            int id = view.getId();
            a aVar = a.this;
            if (id != R.id.google) {
                if (id != R.id.title) {
                    return;
                }
                Fault fault = (Fault) aVar.f41158b.get(adapterPosition);
                ArrayList arrayList = aVar.f41157a;
                if (arrayList.contains(fault)) {
                    arrayList.remove(fault);
                } else {
                    ((J8.a) aVar.f41164h.getValue()).D();
                    arrayList.add(fault);
                }
                aVar.notifyItemChanged(adapterPosition);
                return;
            }
            E e10 = aVar.f41160d;
            MainActivity mainActivity = aVar.f41159c;
            String string = " ";
            if (e10 != null) {
                StringBuilder sb2 = new StringBuilder();
                E e11 = aVar.f41160d;
                sb2.append(e11.d());
                sb2.append(" ");
                sb2.append(e11.e());
                sb2.append(" ");
                string = sb2.toString();
            }
            StringBuilder sbF = b.f(string, "trouble code ");
            sbF.append(((Fault) aVar.f41158b.get(adapterPosition)).f29433d);
            String strC = B7.b.c("https://www.google.com/search?q=", sbF.toString());
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(strC));
                mainActivity.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                e.D("FaultsAdapter", "Handled ActivityNotFoundException - there is no browser to open web page.");
                P.b(mainActivity, R.string.common_no_web_app);
            }
            UserTrackingUtils.c(UserTrackingUtils.Key.f34250K, 1);
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            LinearLayout linearLayout = (LinearLayout) view;
            TextView textView = (TextView) linearLayout.getChildAt(0);
            TextView textView2 = (TextView) linearLayout.getChildAt(1);
            a aVar = a.this;
            ((ClipboardManager) aVar.f41159c.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(textView.getText(), textView2.getText()));
            Locale locale = Locale.US;
            CharSequence text = textView.getText();
            MainActivity mainActivity = aVar.f41159c;
            P.e(mainActivity, String.format(locale, "%s %s", text, mainActivity.getString(R.string.common_copied)));
            view.setPressed(false);
            return true;
        }
    }

    public a(MainActivity mainActivity, DatabaseLanguage databaseLanguage, E e10, boolean z10) {
        this.f41159c = mainActivity;
        this.f41161e = databaseLanguage;
        this.f41160d = e10;
        this.f41163g = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f41158b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i10) {
        return 0L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.B b10, int i10) {
        GradientDrawable gradientDrawable;
        ViewOnClickListenerC0470a viewOnClickListenerC0470a = (ViewOnClickListenerC0470a) b10;
        String strB = this.f41161e.b();
        Fault fault = (Fault) this.f41158b.get(i10);
        String strC = fault.c(strB);
        if (strC.isEmpty()) {
            strC = fault.f29433d;
        }
        String strD = fault.d(strB);
        boolean zI = fault.i();
        MainActivity mainActivity = this.f41159c;
        if (!zI) {
            strD = mainActivity.getString(R.string.view_faults_manufacturer_specific_fault);
        } else if (strD.isEmpty()) {
            String[] strArrSplit = strC.split("\n");
            String str = strArrSplit[0];
            if (strArrSplit.length == 2) {
                strD = strArrSplit[1];
            }
            strC = str;
        }
        viewOnClickListenerC0470a.f41165b.setText(strC);
        viewOnClickListenerC0470a.f41166c.setText(strD);
        String strH = fault.h();
        int color = (strH.charAt(strH.length() - 1) == '3' || strH.charAt(strH.length() - 1) == '2') ? mainActivity.getResources().getColor(R.color.fault_status_red) : mainActivity.getResources().getColor(R.color.fault_status_green);
        boolean zContains = this.f41157a.contains(fault);
        ImageView imageView = viewOnClickListenerC0470a.f41167d;
        LinearLayout linearLayout = viewOnClickListenerC0470a.f41169f;
        TextView textView = viewOnClickListenerC0470a.f41165b;
        if (zContains) {
            textView.setSelected(true);
            linearLayout.setVisibility(0);
            imageView.setBackground(mainActivity.getResources().getDrawable(R.drawable.faults_google_background_2));
            GradientDrawable gradientDrawable2 = (GradientDrawable) mainActivity.getResources().getDrawable(R.drawable.fault_status_2);
            String str2 = fault.f29433d;
            LinearLayout linearLayout2 = viewOnClickListenerC0470a.f41170g;
            TextView textView2 = (TextView) linearLayout2.getChildAt(0);
            TextView textView3 = (TextView) linearLayout2.getChildAt(1);
            a aVar = a.this;
            Locale locale = new Locale(aVar.f41161e.b());
            MainActivity mainActivity2 = aVar.f41159c;
            Configuration configuration = new Configuration(mainActivity2.getResources().getConfiguration());
            configuration.setLocale(locale);
            textView2.setText(mainActivity2.createConfigurationContext(configuration).getText(R.string.view_fault_code).toString());
            textView3.setText(str2);
            String strG = fault.g(strB);
            LinearLayout linearLayout3 = viewOnClickListenerC0470a.f41171h;
            TextView textView4 = (TextView) linearLayout3.getChildAt(0);
            TextView textView5 = (TextView) linearLayout3.getChildAt(1);
            Locale locale2 = new Locale(aVar.f41161e.b());
            Configuration configuration2 = new Configuration(mainActivity2.getResources().getConfiguration());
            configuration2.setLocale(locale2);
            textView4.setText(mainActivity2.createConfigurationContext(configuration2).getText(R.string.view_fault_status).toString());
            textView5.setText(strG);
            try {
                viewOnClickListenerC0470a.a(fault.f());
            } catch (FaultException unused) {
                if (c.e() && this.f41163g && this.f41162f) {
                    viewOnClickListenerC0470a.f41172i.setVisibility(0);
                    fault.f29430a = false;
                    ControlUnit controlUnit = fault.f29431b;
                    String strF0 = controlUnit.f0();
                    Locale locale3 = Locale.US;
                    e.s(strF0, C0936h.d("readFreezeFrame(rawCode=", fault.f29432c, ", faultCode=", fault.f29433d, ")"));
                    (controlUnit.f29327i == ApplicationProtocol.f29262b ? Task.forResult(null) : controlUnit.D(false).continueWithTask(new k(controlUnit, 2, fault))).continueWith(new C2092g(6, fault)).continueWith(new C2097l(this, 1, viewOnClickListenerC0470a), Task.UI_THREAD_EXECUTOR);
                } else {
                    viewOnClickListenerC0470a.a(fault.f29441m);
                }
            }
            gradientDrawable = gradientDrawable2;
        } else {
            textView.setSelected(false);
            linearLayout.setVisibility(8);
            imageView.setBackground(mainActivity.getResources().getDrawable(R.drawable.faults_google_background_1));
            gradientDrawable = (GradientDrawable) mainActivity.getResources().getDrawable(R.drawable.fault_status_1);
        }
        gradientDrawable.setColor(color);
        viewOnClickListenerC0470a.f41168e.setBackground(gradientDrawable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new ViewOnClickListenerC0470a(LayoutInflater.from(this.f41159c).inflate(R.layout.item_fault, viewGroup, false));
    }
}
