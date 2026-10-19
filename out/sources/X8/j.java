package X8;

import B8.AbstractC0638l0;
import android.graphics.Color;
import androidx.lifecycle.D;
import com.voltasit.obdeleven.presentation.dialogs.sfd.SfdAutoUnlockDialog;
import com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog;
import com.voltasit.obdeleven.presentation.settings.SettingsFragment;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.obdeleven.ui.view.ColorPickerSeekbar;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f7394c;

    public /* synthetic */ j(BaseFragment baseFragment, int i10) {
        this.f7393b = i10;
        this.f7394c = baseFragment;
    }

    @Override // androidx.lifecycle.D
    public final void d(Object obj) {
        int i10;
        switch (this.f7393b) {
            case 0:
                s sVar = (s) this.f7394c;
                sVar.getClass();
                new SfdAutoUnlockDialog().v(sVar.getChildFragmentManager(), "SfdAutoUnlockDialog");
                return;
            case 1:
                new com.voltasit.obdeleven.presentation.dialogs.j(((com.voltasit.obdeleven.presentation.controlUnit.basicsettings.i) this.f7394c).requireContext()).show();
                return;
            case 2:
                com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.q qVar = (com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.q) this.f7394c;
                if (qVar.f31857z != null) {
                    SfdWizardFullScreenDialog sfdWizardFullScreenDialog = new SfdWizardFullScreenDialog();
                    sfdWizardFullScreenDialog.F(qVar.f31857z.n());
                    sfdWizardFullScreenDialog.v(qVar.getChildFragmentManager(), "SfdWizardFullScreenDialog");
                    return;
                }
                return;
            case 3:
                com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h hVar = (com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h) this.f7394c;
                if (hVar.f31925q != null) {
                    SfdWizardFullScreenDialog sfdWizardFullScreenDialog2 = new SfdWizardFullScreenDialog();
                    sfdWizardFullScreenDialog2.F(hVar.f31925q.n());
                    sfdWizardFullScreenDialog2.v(hVar.getChildFragmentManager(), "SfdWizardFullScreenDialog");
                    return;
                }
                return;
            default:
                Integer num = (Integer) obj;
                SettingsFragment this$0 = (SettingsFragment) this.f7394c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                AbstractC0638l0 abstractC0638l0 = this$0.f33082o;
                if (abstractC0638l0 == null) {
                    kotlin.jvm.internal.i.m("binding");
                    throw null;
                }
                kotlin.jvm.internal.i.b(num);
                int iIntValue = num.intValue();
                ColorPickerSeekbar colorPickerSeekbar = abstractC0638l0.f2002B;
                colorPickerSeekbar.getClass();
                int iRgb = Color.rgb(255, 255, 255);
                int iRed = Color.red(iRgb);
                int iGreen = Color.green(iRgb);
                int iBlue = Color.blue(iRgb);
                int iRed2 = Color.red(iIntValue);
                int iGreen2 = Color.green(iIntValue);
                int iBlue2 = Color.blue(iIntValue);
                int i11 = -1;
                int i12 = -1;
                int i13 = -1;
                float f10 = 0.0f;
                for (int i14 = 255; f10 < 1.0f && (i12 < 0 || i13 < 0 || i11 < 0 || i12 > i14 || i13 > i14 || i11 > i14); i14 = 255) {
                    f10 += 0.00390625f;
                    float f11 = 1.0f / f10;
                    float f12 = 1.0f - f11;
                    i12 = (int) ((iRed * f12) + (iRed2 * f11));
                    i13 = (int) ((iGreen * f12) + (iGreen2 * f11));
                    i11 = (int) ((iBlue * f12) + (iBlue2 * f11));
                }
                colorPickerSeekbar.setColor((i12 < 0 || i13 < 0 || i11 < 0) ? 0 : Color.rgb(i12, i13, i11));
                AbstractC0638l0 abstractC0638l1 = this$0.f33082o;
                if (abstractC0638l1 == null) {
                    kotlin.jvm.internal.i.m("binding");
                    throw null;
                }
                int iIntValue2 = num.intValue();
                ColorPickerSeekbar colorPickerSeekbar2 = abstractC0638l1.f2002B;
                colorPickerSeekbar2.getClass();
                int iRgb2 = Color.rgb(255, 255, 255);
                int iRed3 = Color.red(iRgb2);
                int iGreen3 = Color.green(iRgb2);
                int iBlue3 = Color.blue(iRgb2);
                int iRed4 = Color.red(iIntValue2);
                int iGreen4 = Color.green(iIntValue2);
                int iBlue4 = Color.blue(iIntValue2);
                int i15 = -1;
                int i16 = -1;
                int i17 = -1;
                float f13 = 0.0f;
                while (true) {
                    if (f13 < 1.0f) {
                        if (i17 >= 0 && i15 >= 0 && i16 >= 0) {
                            i10 = 255;
                            if (i17 > 255 || i15 > 255 || i16 > 255) {
                            }
                        }
                        f13 += 0.00390625f;
                        float f14 = 1.0f / f13;
                        float f15 = 1.0f - f14;
                        int i18 = (int) ((iRed3 * f15) + (iRed4 * f14));
                        int i19 = (int) ((iGreen3 * f15) + (iGreen4 * f14));
                        int i20 = (int) ((iBlue3 * f15) + (iBlue4 * f14));
                        i17 = i18;
                        i16 = i20;
                        i15 = i19;
                    } else {
                        i10 = 255;
                    }
                }
                double d10 = f13;
                colorPickerSeekbar2.setAlphaBarPosition(d10 >= 1.0d ? i10 : d10 <= 0.0d ? 0 : (int) Math.floor(d10 * 256.0d));
                return;
        }
    }
}
