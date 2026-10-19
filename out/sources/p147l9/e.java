package p147l9;

import C4.b;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.util.Pair;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.C1787c0;
import com.obdeleven.service.enums.ValueUnit;
import com.obdeleven.service.model.UDSResult;
import com.obdeleven.service.odx.OdxFactory$Exception;
import com.obdeleven.service.odx.Param;
import com.obdeleven.service.odx.e;
import com.obdeleven.service.odx.model.COMPUSCALE;
import com.obdeleven.service.odx.model.DATAOBJECTPROP;
import com.obdeleven.service.odx.model.DIAGLAYER;
import com.obdeleven.service.odx.model.LIMIT;
import com.obdeleven.service.odx.model.ODXLINK;
import com.obdeleven.service.odx.model.VT;
import com.obdeleven.service.util.Texttabe;
import com.parse.boltsinternal.Capture;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.app.p0;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import p110i9.c;
import p134k8.T1;
import p220r9.P;
import p255u9.y;
import p255u9.z;

/* JADX INFO: compiled from: UDSBackupAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class e extends c<Object, a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MainActivity f44485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.obdeleven.service.odx.e.g f44486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.obdeleven.service.odx.e f44487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LayoutInflater f44488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseArray<String> f44489h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseArray<UDSResult> f44490i;
    public final boolean j;

    /* JADX INFO: compiled from: UDSBackupAdapter.java */
    public class a extends RecyclerView.B {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f44491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LinearLayout f44492c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ProgressBar f44493d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ViewOnLongClickListenerC0506a f44494e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final b f44495f;

        /* JADX INFO: renamed from: l9.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: UDSBackupAdapter.java */
        public class ViewOnLongClickListenerC0506a implements View.OnLongClickListener {
            public ViewOnLongClickListenerC0506a() {
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                LinearLayout linearLayout = (LinearLayout) view;
                TextView textView = (TextView) linearLayout.getChildAt(0);
                TextView textView2 = (TextView) linearLayout.getChildAt(1);
                a aVar = a.this;
                ((ClipboardManager) e.this.f44485d.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(textView.getText(), textView2.getText()));
                e eVar = e.this;
                P.e(eVar.f44485d, String.format(Locale.US, "%s %s", textView.getText(), eVar.f44485d.getString(R.string.common_copied)));
                view.setPressed(false);
                return true;
            }
        }

        /* JADX INFO: compiled from: UDSBackupAdapter.java */
        public class b implements View.OnLongClickListener {
            public b() {
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                a aVar = a.this;
                ClipboardManager clipboardManager = (ClipboardManager) e.this.f44485d.getSystemService("clipboard");
                e eVar = e.this;
                clipboardManager.setPrimaryClip(ClipData.newPlainText(eVar.f44485d.getString(R.string.common_value), ((TextView) view).getText()));
                MainActivity mainActivity = eVar.f44485d;
                Locale locale = Locale.US;
                P.e(mainActivity, mainActivity.getString(R.string.common_value) + " " + eVar.f44485d.getString(R.string.common_copied));
                view.setPressed(false);
                return true;
            }
        }

        public a(View view) {
            super(view);
            this.f44494e = new ViewOnLongClickListenerC0506a();
            this.f44495f = new b();
            this.f44491b = (TextView) view.findViewById(R.id.itemUds_title);
            this.f44492c = (LinearLayout) view.findViewById(R.id.itemUds_content);
            this.f44493d = (ProgressBar) view.findViewById(R.id.itemUds_progress);
        }

        public final void a(LinearLayout linearLayout, String str, String str2, boolean z10) {
            e eVar = e.this;
            LinearLayout linearLayout2 = (LinearLayout) eVar.f44488g.inflate(R.layout.item_labeled_button, (ViewGroup) linearLayout, false);
            ((TextView) linearLayout2.getChildAt(0)).setText(str);
            ((TextView) linearLayout2.getChildAt(1)).setText(str2);
            linearLayout.addView(linearLayout2);
            linearLayout2.setOnLongClickListener(this.f44494e);
            if (z10) {
                eVar.f44488g.inflate(R.layout.item_button_divider, (ViewGroup) linearLayout, true);
            }
        }
    }

    public e(MainActivity mainActivity, com.obdeleven.service.odx.e.g gVar, com.obdeleven.service.odx.e eVar, boolean z10) {
        super(mainActivity);
        this.f44489h = new SparseArray<>();
        this.f44490i = new SparseArray<>();
        this.f44485d = mainActivity;
        this.f44486e = gVar;
        this.f44487f = eVar;
        this.f44488g = LayoutInflater.from(mainActivity);
        this.j = z10;
    }

    @Override // p110i9.c
    public final void b(RecyclerView.B b10, Object obj) {
        ArrayList arrayListC;
        e eVar;
        int i10;
        String strF;
        final a aVar = (a) b10;
        boolean z10 = obj instanceof y;
        boolean z11 = this.j;
        if (!z10) {
            if (obj instanceof List) {
                List list = (List) obj;
                aVar.f44491b.setText(R.string.common_long_coding);
                LinearLayout linearLayout = aVar.f44492c;
                linearLayout.setVisibility(0);
                aVar.f44493d.setVisibility(8);
                linearLayout.removeAllViews();
                int i11 = 0;
                while (i11 < list.size()) {
                    String strD = ((Param) list.get(i11)).d();
                    if (z11) {
                        StringBuilder sbF = b.f(strD, " (");
                        sbF.append(((Param) list.get(i11)).f29463l);
                        sbF.append("/");
                        sbF.append(((Param) list.get(i11)).f29464m);
                        sbF.append("/");
                        sbF.append(((Param) list.get(i11)).b());
                        sbF.append(")");
                        strD = sbF.toString();
                    }
                    aVar.a(linearLayout, strD, ((Param) list.get(i11)).f(), i11 != list.size() - 1);
                    i11++;
                }
                return;
            }
            return;
        }
        final y yVar = (y) obj;
        String strConcat = this.f44489h.get(aVar.getAdapterPosition());
        UDSResult uDSResult = this.f44490i.get(aVar.getAdapterPosition());
        aVar.itemView.setVisibility(0);
        aVar.itemView.setLayoutParams(new RecyclerView.m(-1, -2));
        LinearLayout linearLayout2 = aVar.f44492c;
        ProgressBar progressBar = aVar.f44493d;
        TextView textView = aVar.f44491b;
        if (strConcat == null || uDSResult == null) {
            textView.setText(R.string.common_loading);
            linearLayout2.setVisibility(8);
            progressBar.setVisibility(0);
            final Capture capture = new Capture();
            final com.obdeleven.service.odx.e.g gVar = this.f44486e;
            Task.callInBackground(new Callable() { // from class: l9.d
                @Override // java.util.concurrent.Callable
                public final Object call() throws OdxFactory$Exception {
                    UDSResult uDSResultB;
                    String strC;
                    e eVar2 = this.f44480b;
                    eVar2.getClass();
                    e.g gVar2 = gVar;
                    ODXLINK keydopref = gVar2.f29507a.getKEYDOPREF();
                    DIAGLAYER diaglayer = gVar2.f29508b;
                    e eVar3 = eVar2.f44487f;
                    e.c cVarL = eVar3.l(keydopref, diaglayer);
                    Capture capture2 = capture;
                    y yVar2 = yVar;
                    if (cVarL != null) {
                        for (COMPUSCALE compuscale : ((DATAOBJECTPROP) cVarL.f29499a).getCOMPUMETHOD().getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE()) {
                            LIMIT lowerlimit = compuscale.getLOWERLIMIT();
                            if (lowerlimit == null) {
                                lowerlimit = compuscale.getUPPERLIMIT();
                            }
                            if (lowerlimit != null && Integer.parseInt(lowerlimit.getValue()) == yVar2.a()) {
                                VT vt = compuscale.getCOMPUCONST().getVT();
                                if (vt.getTI() != null && (strC = Texttabe.c(vt.getTI())) != null) {
                                    capture2.set(strC);
                                }
                                if (capture2.get() != null) {
                                    break;
                                }
                                capture2.set(vt.getValue());
                                break;
                            }
                        }
                    }
                    if (capture2.get() == null) {
                        capture2.set(eVar2.f44485d.getString(R.string.common_unknown));
                    }
                    boolean zEquals = "SECURITY_ACCESS".equals(yVar2.b());
                    SparseArray<UDSResult> sparseArray = eVar2.f44490i;
                    SparseArray<String> sparseArray2 = eVar2.f44489h;
                    e.a aVar2 = aVar;
                    if (zEquals) {
                        uDSResultB = UDSResult.a("33");
                    } else {
                        try {
                            uDSResultB = UDSResult.b(yVar2.a(), yVar2.b(), gVar2, eVar3);
                        } catch (OdxFactory$Exception e10) {
                            UDSResult uDSResult2 = new UDSResult(UDSResult.Type.f29417c, yVar2.a(), (Param) null);
                            sparseArray2.put(aVar2.getAdapterPosition(), aVar2.itemView.getContext().getString(R.string.view_uds_data_could_not_parse_from_odx));
                            sparseArray.put(aVar2.getAdapterPosition(), uDSResult2);
                            O.e.m(e10);
                            throw e10;
                        }
                    }
                    sparseArray2.put(aVar2.getAdapterPosition(), (String) capture2.get());
                    sparseArray.put(aVar2.getAdapterPosition(), uDSResultB);
                    return uDSResultB;
                }
            }).continueWithTask(new p0(this, 5, aVar), Task.UI_THREAD_EXECUTOR);
            return;
        }
        UDSResult.Type type = UDSResult.Type.f29417c;
        Param param = uDSResult.f29414c;
        UDSResult.Type type2 = uDSResult.f29412a;
        if (type2 == type && param == null) {
            aVar.itemView.setVisibility(8);
            aVar.itemView.setLayoutParams(new RecyclerView.m(0, 0));
            return;
        }
        if (z11) {
            strConcat = strConcat.concat(String.format(" (%04X)", Integer.valueOf(yVar.a())));
        }
        textView.setText(strConcat);
        progressBar.setVisibility(8);
        linearLayout2.setVisibility(0);
        linearLayout2.removeAllViews();
        if (type2 == UDSResult.Type.f29416b) {
            arrayListC = param.c(true);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(param);
            arrayListC = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int i12 = 0;
        while (true) {
            int size = arrayListC.size();
            eVar = e.this;
            if (i12 >= size) {
                break;
            }
            Param param2 = (Param) arrayListC.get(i12);
            String strD2 = param2.d();
            int i13 = z.f47484b;
            if (eVar.j) {
                StringBuilder sbF2 = b.f(strD2, " (");
                sbF2.append(param2.f29463l);
                sbF2.append("/");
                sbF2.append(param2.f29464m);
                sbF2.append("/");
                sbF2.append(param2.b());
                sbF2.append(")");
                strD2 = sbF2.toString();
            }
            Param.Type type3 = param2.f29453a;
            Param.Type type4 = Param.Type.f29473h;
            MainActivity mainActivity = eVar.f44485d;
            if (type3 == type4) {
                strF = mainActivity.getString(R.string.common_not_available);
            } else {
                String strF2 = param2.f();
                String strE = param2.e();
                List<String> list2 = com.voltasit.obdeleven.a.f29638c;
                if (com.voltasit.obdeleven.a.C0320a.a(mainActivity).i() == ValueUnit.f29311c) {
                    T1 t1K = C1787c0.k(new T1(null, strF2, strE));
                    String str = t1K.f42679b;
                    strE = t1K.f42680c;
                    strF2 = str;
                }
                strF = (strE == null || strE.isEmpty()) ? strF2 : O.a.f(strF2, " ", strE);
            }
            if ((strD2 != null && !strD2.isEmpty()) || (strF != null && !strF.isEmpty())) {
                arrayList2.add(new Pair(strD2, strF));
            }
            i12++;
        }
        int i14 = 0;
        while (i14 < arrayList2.size()) {
            String str2 = (String) ((Pair) arrayList2.get(i14)).first;
            String str3 = (String) ((Pair) arrayList2.get(i14)).second;
            if (str2 == null || str2.isEmpty()) {
                boolean z12 = i14 != arrayList2.size() + (-1);
                TextView textView2 = (TextView) eVar.f44488g.inflate(R.layout.item_button, (ViewGroup) linearLayout2, false);
                textView2.setText(str3);
                linearLayout2.addView(textView2);
                textView2.setOnLongClickListener(aVar.f44495f);
                if (z12) {
                    i10 = 1;
                    eVar.f44488g.inflate(R.layout.item_button_divider, (ViewGroup) linearLayout2, true);
                } else {
                    i10 = 1;
                }
            } else {
                aVar.a(linearLayout2, str2, str3, i14 != arrayList2.size() + (-1));
                i10 = 1;
            }
            i14 += i10;
        }
    }

    public final void e(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a((y) it.next());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new a(this.f44488g.inflate(R.layout.item_uds, viewGroup, false));
    }
}
