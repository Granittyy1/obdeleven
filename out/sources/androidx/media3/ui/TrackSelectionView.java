package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p078g1.B;
import p078g1.y;
import p078g1.z;
import p128k2.r;

/* JADX INFO: loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayoutInflater f18860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckedTextView f18861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CheckedTextView f18862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f18863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f18864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f18865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18866i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public r f18867k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CheckedTextView[][] f18868l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f18869m;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            TrackSelectionView trackSelectionView = TrackSelectionView.this;
            CheckedTextView checkedTextView = trackSelectionView.f18861d;
            HashMap map = trackSelectionView.f18865h;
            boolean z10 = true;
            if (view == checkedTextView) {
                trackSelectionView.f18869m = true;
                map.clear();
            } else if (view == trackSelectionView.f18862e) {
                trackSelectionView.f18869m = false;
                map.clear();
            } else {
                trackSelectionView.f18869m = false;
                Object tag = view.getTag();
                tag.getClass();
                b bVar = (b) tag;
                B.a aVar = bVar.f18871a;
                y yVar = aVar.f35223b;
                z zVar = (z) map.get(yVar);
                int i10 = bVar.f18872b;
                if (zVar == null) {
                    if (!trackSelectionView.j && map.size() > 0) {
                        map.clear();
                    }
                    map.put(yVar, new z(yVar, ImmutableList.M(Integer.valueOf(i10))));
                } else {
                    ArrayList arrayList = new ArrayList(zVar.f35497b);
                    boolean zIsChecked = ((CheckedTextView) view).isChecked();
                    boolean z11 = trackSelectionView.f18866i && aVar.f35224c;
                    if (!z11 && (!trackSelectionView.j || trackSelectionView.f18864g.size() <= 1)) {
                        z10 = false;
                    }
                    if (zIsChecked && z10) {
                        arrayList.remove(Integer.valueOf(i10));
                        if (arrayList.isEmpty()) {
                            map.remove(yVar);
                        } else {
                            map.put(yVar, new z(yVar, arrayList));
                        }
                    } else if (!zIsChecked) {
                        if (z11) {
                            arrayList.add(Integer.valueOf(i10));
                            map.put(yVar, new z(yVar, arrayList));
                        } else {
                            map.put(yVar, new z(yVar, ImmutableList.M(Integer.valueOf(i10))));
                        }
                    }
                }
            }
            trackSelectionView.a();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final B.a f18871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18872b;

        public b(B.a aVar, int i10) {
            this.f18871a = aVar;
            this.f18872b = i10;
        }
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f18859b = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f18860c = layoutInflaterFrom;
        a aVar = new a();
        this.f18863f = aVar;
        this.f18867k = new Z3.z(getResources());
        this.f18864g = new ArrayList();
        this.f18865h = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f18861d = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(com.voltasit.obdeleven.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(aVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(com.voltasit.obdeleven.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f18862e = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(com.voltasit.obdeleven.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(aVar);
        addView(checkedTextView2);
    }

    public final void a() {
        this.f18861d.setChecked(this.f18869m);
        boolean z10 = this.f18869m;
        HashMap map = this.f18865h;
        this.f18862e.setChecked(!z10 && map.size() == 0);
        for (int i10 = 0; i10 < this.f18868l.length; i10++) {
            z zVar = (z) map.get(((B.a) this.f18864g.get(i10)).f35223b);
            int i11 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f18868l[i10];
                if (i11 < checkedTextViewArr.length) {
                    if (zVar != null) {
                        Object tag = checkedTextViewArr[i11].getTag();
                        tag.getClass();
                        this.f18868l[i10][i11].setChecked(zVar.f35497b.contains(Integer.valueOf(((b) tag).f18872b)));
                    } else {
                        checkedTextViewArr[i11].setChecked(false);
                    }
                    i11++;
                }
            }
        }
    }

    public final void b() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.f18864g;
        boolean zIsEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.f18862e;
        CheckedTextView checkedTextView2 = this.f18861d;
        if (zIsEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.f18868l = new CheckedTextView[arrayList.size()][];
        boolean z10 = this.j && arrayList.size() > 1;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            B.a aVar = (B.a) arrayList.get(i10);
            boolean z11 = this.f18866i && aVar.f35224c;
            CheckedTextView[][] checkedTextViewArr = this.f18868l;
            int i11 = aVar.f35222a;
            checkedTextViewArr[i10] = new CheckedTextView[i11];
            b[] bVarArr = new b[i11];
            for (int i12 = 0; i12 < aVar.f35222a; i12++) {
                bVarArr[i12] = new b(aVar, i12);
            }
            for (int i13 = 0; i13 < i11; i13++) {
                LayoutInflater layoutInflater = this.f18860c;
                if (i13 == 0) {
                    addView(layoutInflater.inflate(com.voltasit.obdeleven.R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate((z11 || z10) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.f18859b);
                r rVar = this.f18867k;
                b bVar = bVarArr[i13];
                checkedTextView3.setText(rVar.a(bVar.f18871a.f35223b.f35494d[bVar.f18872b]));
                checkedTextView3.setTag(bVarArr[i13]);
                if (aVar.b(i13)) {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.f18863f);
                } else {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.f18868l[i10][i13] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        a();
    }

    public boolean getIsDisabled() {
        return this.f18869m;
    }

    public Map<y, z> getOverrides() {
        return this.f18865h;
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.f18866i != z10) {
            this.f18866i = z10;
            b();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.j != z10) {
            this.j = z10;
            if (!z10) {
                HashMap map = this.f18865h;
                if (map.size() > 1) {
                    ArrayList arrayList = this.f18864g;
                    HashMap map2 = new HashMap();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        z zVar = (z) map.get(((B.a) arrayList.get(i10)).f35223b);
                        if (zVar != null && map2.isEmpty()) {
                            map2.put(zVar.f35496a, zVar);
                        }
                    }
                    map.clear();
                    map.putAll(map2);
                }
            }
            b();
        }
    }

    public void setShowDisableOption(boolean z10) {
        this.f18861d.setVisibility(z10 ? 0 : 8);
    }

    public void setTrackNameProvider(r rVar) {
        rVar.getClass();
        this.f18867k = rVar;
        b();
    }
}
