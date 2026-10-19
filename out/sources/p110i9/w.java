package p110i9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.models.SupportedManufacturer;

/* JADX INFO: compiled from: SupportedManufacturerAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class w extends j<SupportedManufacturer> {
    @Override // p110i9.j
    public final View b(SupportedManufacturer supportedManufacturer, View view, ViewGroup viewGroup) {
        SupportedManufacturer supportedManufacturer2 = supportedManufacturer;
        Context context = this.f36804c;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.supported_model_list_item, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(R.id.supportedModelList_name);
        textView.setText(supportedManufacturer2.toString());
        textView.startAnimation(AnimationUtils.loadAnimation(context, R.anim.scale_in_horizontal));
        return view;
    }
}
