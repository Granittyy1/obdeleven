package com.voltasit.obdeleven.ui.module;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.Positionable$Position;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import java.util.List;

/* JADX INFO: compiled from: BlurFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class b extends BaseFragment implements SeekBar.OnSeekBarChangeListener, View.OnClickListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f34095l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SeekBar f34096m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f34097n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Bitmap f34098o;

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_bg_blur, viewGroup, false);
        this.f34095l = (ImageView) viewInflate.findViewById(R.id.blurFragment_image);
        this.f34096m = (SeekBar) viewInflate.findViewById(R.id.blurFragment_seekBar);
        Button button = (Button) viewInflate.findViewById(R.id.blurFragment_cancel);
        Button button2 = (Button) viewInflate.findViewById(R.id.blurFragment_save);
        this.f34096m.setOnSeekBarChangeListener(this);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        this.f34097n = getArguments().getInt("type");
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(((Uri) getArguments().getParcelable("uri")).getPath());
        this.f34098o = bitmapDecodeFile;
        this.f34095l.setImageBitmap(bitmapDecodeFile);
        return viewInflate;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "BlurFragment";
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.blurFragment_cancel) {
            q().K();
            return;
        }
        if (id != R.id.blurFragment_save) {
            return;
        }
        int progress = this.f34096m.getProgress();
        if (progress == 0) {
            progress = 1;
        }
        if (this.f34097n == 0) {
            Context context = getContext();
            List<String> list = com.voltasit.obdeleven.a.f29638c;
            com.voltasit.obdeleven.a.C0320a.a(context).k(progress, "backgroundBlurRadius");
        } else {
            Context context2 = getContext();
            List<String> list2 = com.voltasit.obdeleven.a.f29638c;
            com.voltasit.obdeleven.a.C0320a.a(context2).k(progress, "menuBackgroundBlurRadius");
        }
        q().F();
        q().K();
        UserTrackingUtils.c(UserTrackingUtils.Key.f34245F, 1);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int progress = seekBar.getProgress();
        if (progress == 0) {
            progress = 1;
        }
        Context context = getContext();
        new View(context).setTag("e");
        p280wa.b bVar = new p280wa.b();
        bVar.f47834c = progress;
        Bitmap bitmap = this.f34098o;
        ImageView imageView = this.f34095l;
        bVar.f47832a = bitmap.getWidth();
        bVar.f47833b = bitmap.getHeight();
        imageView.setImageDrawable(new BitmapDrawable(context.getResources(), p280wa.a.a(imageView.getContext(), bitmap, bVar)));
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Position t() {
        return Positionable$Position.f31108d;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        return getString(R.string.view_blur_blur_image);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
    }
}
