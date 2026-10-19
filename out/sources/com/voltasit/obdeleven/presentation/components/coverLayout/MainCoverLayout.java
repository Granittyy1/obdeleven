package com.voltasit.obdeleven.presentation.components.coverLayout;

import J8.u;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.C1787c0;
import com.google.android.material.imageview.ShapeableImageView;
import com.voltasit.obdeleven.R;
import java.util.List;
import kotlin.jvm.internal.i;
import org.koin.java.KoinJavaComponent;
import p220r9.C2786s;
import p255u9.E;

/* JADX INFO: compiled from: MainCoverLayout.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class MainCoverLayout extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f31375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ShapeableImageView f31376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ShapeableImageView f31377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f31378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f31379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f31380g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainCoverLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.e(context, "context");
        this.f31375b = KoinJavaComponent.b(u.class, null, null);
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout.setForeground(getResources().getDrawable(R.drawable.foreground_gradient_top_bottom_top_corners));
        this.f31376c = a(frameLayout);
        this.f31377d = a(frameLayout);
        addView(frameLayout);
        this.f31378e = b(this, 51);
        this.f31379f = b(this, 53);
        this.f31380g = b(this, 85);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    private final u getRemoteConfigProvider() {
        return (u) this.f31375b.getValue();
    }

    public final ShapeableImageView a(FrameLayout frameLayout) {
        ShapeableImageView shapeableImageView = new ShapeableImageView(getContext(), null, 0);
        shapeableImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        shapeableImageView.setAdjustViewBounds(true);
        shapeableImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        shapeableImageView.setImageResource(R.drawable.main_cover_image_v3);
        float dimension = getResources().getDimension(R.dimen.corner_radius);
        S5.i.a aVarE = shapeableImageView.getShapeAppearanceModel().e();
        aVarE.e(dimension);
        aVarE.f(dimension);
        shapeableImageView.setShapeAppearanceModel(aVarE.a());
        frameLayout.addView(shapeableImageView);
        return shapeableImageView;
    }

    public final TextView b(MainCoverLayout mainCoverLayout, int i10) {
        TextView textView = new TextView(getContext(), null, R.style.Text_Medium_Wrap);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = i10;
        textView.setLayoutParams(layoutParams);
        int iA = C2786s.a(getResources(), 5.0f);
        textView.setPadding(iA, iA, iA, iA);
        textView.setTextColor(getResources().getColor(android.R.color.white));
        textView.setTextSize(18.0f);
        textView.setTypeface(C1787c0.j());
        mainCoverLayout.addView(textView);
        return textView;
    }

    public final void c() {
        ShapeableImageView shapeableImageView = this.f31377d;
        i.b(shapeableImageView);
        shapeableImageView.setVisibility(8);
        ShapeableImageView shapeableImageView2 = this.f31376c;
        i.b(shapeableImageView2);
        shapeableImageView2.setVisibility(0);
        TextView textView = this.f31378e;
        i.b(textView);
        textView.setText(R.string.common_garage);
        TextView textView2 = this.f31379f;
        i.b(textView2);
        textView2.setVisibility(8);
        TextView textView3 = this.f31380g;
        i.b(textView3);
        textView3.setVisibility(8);
    }

    public final void d() {
        TextView textView = this.f31378e;
        i.b(textView);
        textView.setVisibility(8);
        TextView textView2 = this.f31379f;
        i.b(textView2);
        textView2.setVisibility(8);
        TextView textView3 = this.f31380g;
        i.b(textView3);
        textView3.setVisibility(8);
        ShapeableImageView shapeableImageView = this.f31377d;
        i.b(shapeableImageView);
        shapeableImageView.setVisibility(4);
        ShapeableImageView shapeableImageView2 = this.f31376c;
        i.b(shapeableImageView2);
        shapeableImageView2.setVisibility(4);
    }

    public final void setupCarDescription(E vehicleDB) {
        TextView textView = this.f31380g;
        TextView textView2 = this.f31379f;
        TextView textView3 = this.f31378e;
        i.e(vehicleDB, "vehicleDB");
        String strD = vehicleDB.d();
        i.d(strD, "getMake(...)");
        String strE = vehicleDB.e();
        i.d(strE, "getModel(...)");
        if (strE.length() != 0) {
            i.b(textView3);
            textView3.setText(strE);
        } else if (strD.length() == 0) {
            i.b(textView3);
            textView3.setText(vehicleDB.k());
        } else {
            i.b(textView3);
            textView3.setText(strD);
        }
        List<String> list = com.voltasit.obdeleven.a.f29638c;
        Context context = getContext();
        i.d(context, "getContext(...)");
        com.voltasit.obdeleven.a aVarA = com.voltasit.obdeleven.a.C0320a.a(context);
        i.b(textView3);
        textView3.setVisibility(aVarA.b("showVehicleName", false) ? 0 : 8);
        i.b(textView2);
        textView2.setText(vehicleDB.getString("year"));
        i.b(textView2);
        textView2.setVisibility(aVarA.b("showVehicleYear", false) ? 0 : 8);
        if (vehicleDB.c() != null) {
            i.b(textView);
            textView.setText(vehicleDB.c().a());
            i.b(textView);
            textView.setVisibility(aVarA.b("showVehicleEngine", false) ? 0 : 8);
        }
    }
}
