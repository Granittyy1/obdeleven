package V8;

import B8.E0;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC1347l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.obdeleven.service.exception.ControlUnitException;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import java.util.List;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;
import p134k8.D1;
import p220r9.P;

/* JADX INFO: compiled from: SubsystemInfoFragment.java */
/* JADX INFO: loaded from: classes3.dex */
@O8.b("http://obdeleven.proboards.com/thread/107/info")
public class s extends BaseFragment implements AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public D1 f6825l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ControlUnit f6826m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0827a f6827n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.f f6828o = (com.voltasit.obdeleven.domain.usecases.f) KoinJavaComponent.a(com.voltasit.obdeleven.domain.usecases.f.class);

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        int color;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_control_unit_info, viewGroup, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.controlUnitInfoFragment_image);
        TextView textView = (TextView) viewInflate.findViewById(R.id.controlUnitInfoFragment_name);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.controlUnitInfoFragment_number);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.controlUnitInfoFragment_list);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.content_padding);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        p208q9.a aVar = new p208q9.a(getContext(), linearLayoutManager.f19521p);
        aVar.f46180a = getResources().getDrawable(R.drawable.divider_content);
        aVar.f46181b = dimensionPixelSize;
        aVar.f46182c = dimensionPixelSize;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.i(aVar);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(this.f6827n);
        if (this.f6826m == null || this.f6825l == null) {
            q().J();
        } else {
            com.bumptech.glide.d<Drawable> dVarM = com.bumptech.glide.b.c(getContext()).f(this).m(this.f6826m.a0());
            T3.d dVarJ = ((T3.d) E0.a(R.drawable.control_unit_default)).f(R.drawable.control_unit_default).j(R.drawable.control_unit_default);
            kotlin.jvm.internal.i.d(dVarJ, "placeholder(...)");
            dVarM.a(dVarJ).x(imageView);
            textView2.setText(this.f6826m.t());
            ActivityC1347l activity = getActivity();
            List<String> list = com.voltasit.obdeleven.a.f29638c;
            String string2 = this.f6826m.x(DatabaseLanguage.valueOf(com.voltasit.obdeleven.a.C0320a.a(activity).c()).b()) + "\n";
            if (this.f6828o.a()) {
                StringBuilder sbE = C4.b.e(string2);
                Locale locale = Locale.US;
                sbE.append("(" + this.f6825l.getId() + ") ");
                string2 = sbE.toString();
            }
            try {
                string = string2 + this.f6825l.u();
            } catch (ControlUnitException unused) {
                StringBuilder sbE2 = C4.b.e(string2);
                sbE2.append(getResources().getString(R.string.common_unknown));
                string = sbE2.toString();
            }
            textView.setText(string);
            if (!this.f6826m.b()) {
                color = getResources().getColor(R.color.black);
            } else if (this.f6826m.j0()) {
                color = this.f6826m.f29337t ? getResources().getColor(R.color.holo_red_dark) : getResources().getColor(R.color.holo_green_dark);
            } else {
                color = getResources().getColor(R.color.yellow_500);
            }
            textView2.getBackground().mutate().setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            O();
        }
        return viewInflate;
    }

    public final void O() {
        String str;
        try {
            if (!this.f6825l.u().isEmpty()) {
                this.f6827n.a(getString(R.string.common_system_description) + "\n" + this.f6825l.u());
            }
            if (!this.f6825l.t().isEmpty()) {
                this.f6827n.a(getString(R.string.common_hardware_number) + "\n" + this.f6825l.t());
            }
            if (!this.f6825l.n().isEmpty()) {
                this.f6827n.a(getString(R.string.common_hardware_version) + "\n" + this.f6825l.n());
            }
            if (!this.f6825l.l().isEmpty()) {
                this.f6827n.a(getString(R.string.common_software_number) + "\n" + this.f6825l.l());
            }
            if (!this.f6825l.z().isEmpty()) {
                this.f6827n.a(getString(R.string.common_software_version) + "\n" + this.f6825l.z());
            }
            if (!this.f6825l.b().isEmpty()) {
                this.f6827n.a(getString(R.string.common_serial_number) + "\n" + this.f6825l.b());
            }
            int iOrdinal = this.f6825l.v().ordinal();
            if (iOrdinal == 3) {
                this.f6827n.a(getString(R.string.common_coding) + "\n" + ((String) this.f6825l.q().f10040b));
            } else if (iOrdinal == 4) {
                this.f6827n.a(getString(R.string.common_coding) + "\n" + this.f6825l.x().f42831c);
            }
            int iOrdinal2 = this.f6826m.f29326h.ordinal();
            if (iOrdinal2 == 1 || iOrdinal2 == 2) {
                str = "K-Line";
            } else if (iOrdinal2 == 3) {
                str = "TP1.6";
            } else if (iOrdinal2 != 4) {
                str = iOrdinal2 != 5 ? null : "CAN";
            } else {
                str = "TP2.0";
            }
            if (str != null) {
                int iOrdinal3 = this.f6826m.f29327i.ordinal();
                if (iOrdinal3 == 0) {
                    this.f6827n.a(getString(R.string.common_protocol) + "\n" + str + ": KWP1281");
                } else if (iOrdinal3 == 1) {
                    this.f6827n.a(getString(R.string.common_protocol) + "\n" + str + ": KWP2000");
                } else if (iOrdinal3 == 2) {
                    this.f6827n.a(getString(R.string.common_protocol) + "\n" + str + ": UDS");
                }
            }
            this.f6825l.a();
        } catch (ControlUnitException e10) {
            int iA = e10.a();
            if (iA == 0) {
                this.f6825l.c().continueWith(new p(0, this), Task.UI_THREAD_EXECUTOR);
            } else {
                if (iA != 2) {
                    return;
                }
                int i10 = 0;
                this.f6825l.g().continueWithTask(new q(i10, this)).continueWith(new r(i10, this), Task.UI_THREAD_EXECUTOR);
            }
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "SubsystemInfoFragment";
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        setMenuVisibility(true);
        C0827a c0827a = new C0827a(getActivity());
        this.f6827n = c0827a;
        c0827a.f6767c = this;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView<?> adapterView, View view, int i10, long j) {
        String[] strArrSplit = ((String) this.f6827n.f6765a.get(i10)).split("\n");
        String str = strArrSplit[0];
        ((ClipboardManager) getActivity().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str, strArrSplit[1]));
        MainActivity mainActivityQ = q();
        Locale locale = Locale.US;
        P.e(mainActivityQ, str + " " + getString(R.string.common_copied));
        view.setPressed(false);
        return true;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        return getString(R.string.common_info);
    }
}
