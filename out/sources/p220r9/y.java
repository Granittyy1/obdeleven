package p220r9;

import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.ActivityC1347l;
import com.voltas.crop.CropImageActivity;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: ImageCropHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivityC1347l f46504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseFragment f46505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f46506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f46507d;

    /* JADX INFO: compiled from: ImageCropHelper.java */
    public interface a {
        void a();

        void b(File file);
    }

    public y(BaseFragment baseFragment) {
        this.f46504a = baseFragment.getActivity();
        this.f46505b = baseFragment;
    }

    public final boolean a(int i10, int i11, Intent intent) throws Exception {
        if (i10 != 9162 && i10 != 6709) {
            return false;
        }
        if (i11 != -1) {
            this.f46507d.a();
            return true;
        }
        if (i10 != 9162) {
            File file = new File(((Uri) intent.getParcelableExtra("output")).getPath());
            a aVar = this.f46507d;
            if (aVar != null) {
                aVar.b(file);
            }
            return true;
        }
        try {
            ActivityC1347l activityC1347l = this.f46504a;
            File file2 = new File(activityC1347l.getExternalCacheDir(), this.f46506c);
            if (!file2.exists()) {
                file2.getParentFile().mkdirs();
                file2.createNewFile();
            }
            F6.a aVarE = F6.a.e(intent.getData(), Uri.fromFile(file2));
            Intent intent2 = (Intent) aVarE.f3259c;
            intent2.putExtra("aspect_x", 2);
            intent2.putExtra("aspect_y", 1);
            Intent intent3 = (Intent) aVarE.f3259c;
            intent3.putExtra("max_x", 1024);
            intent3.putExtra("max_y", 512);
            BaseFragment baseFragment = this.f46505b;
            Intent intent4 = (Intent) aVarE.f3259c;
            intent4.setClass(activityC1347l, CropImageActivity.class);
            baseFragment.startActivityForResult(intent4, 6709);
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        return true;
    }

    /* JADX INFO: compiled from: ImageCropHelper.java */
    public interface b extends a {
        @Override // r9.y.a
        default void a() {
        }
    }
}
