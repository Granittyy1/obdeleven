package p097h9;

import B8.E0;
import T3.c;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.d;
import com.bumptech.glide.e;
import com.bumptech.glide.load.engine.GlideException;
import com.google.android.material.imageview.ShapeableImageView;
import com.voltasit.obdeleven.R;
import p110i9.h;
import p255u9.i;
import p255u9.j;

/* JADX INFO: compiled from: ManualStepAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class z extends h<j, b> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f36257g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u f36258h;

    /* JADX INFO: compiled from: ManualStepAdapter.java */
    public class a implements c<Bitmap> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ProgressBar f36259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ShapeableImageView f36260b;

        public a(ProgressBar progressBar, ShapeableImageView shapeableImageView) {
            this.f36259a = progressBar;
            this.f36260b = shapeableImageView;
        }

        @Override // T3.c
        public final void b(Object obj) {
            this.f36259a.setVisibility(8);
            this.f36260b.setTag(z.this.f36257g.getParseFile("picture").getUrl());
        }

        @Override // T3.c
        public final void c(GlideException glideException) {
            this.f36259a.setVisibility(8);
            this.f36260b.setImageResource(R.drawable.manual_editor);
        }
    }

    /* JADX INFO: compiled from: ManualStepAdapter.java */
    public class b extends RecyclerView.B implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImageView f36262b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ShapeableImageView f36263c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ProgressBar f36264d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f36265e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final TextView f36266f;

        public b(View view) {
            super(view);
            this.f36262b = (ImageView) view.findViewById(R.id.manualListItem_cover);
            this.f36263c = (ShapeableImageView) view.findViewById(R.id.manualListItem_coverRounded);
            this.f36264d = (ProgressBar) view.findViewById(R.id.manualListItem_progress);
            TextView textView = (TextView) view.findViewById(R.id.manualListItem_text);
            this.f36265e = textView;
            this.f36266f = (TextView) view.findViewById(R.id.manualListItem_title);
            textView.setOnLongClickListener(this);
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            z zVar = z.this;
            if (zVar.f36258h == null) {
                return false;
            }
            return zVar.f36258h.onItemLongClick(null, this.itemView, getAdapterPosition() - 1, getItemId());
        }
    }

    public z(Context context, i iVar) {
        super(context);
        this.f36257g = iVar;
    }

    @Override // p110i9.h
    public final void c(RecyclerView.B b10, int i10) throws Throwable {
        b bVar = (b) b10;
        j jVar = (j) this.f36795b.get(i10);
        bVar.f36266f.setText(TextUtils.isEmpty(jVar.getString("title")) ? this.f36794a.getString(R.string.common_description) : jVar.getString("title"));
        boolean zIsEmpty = TextUtils.isEmpty(jVar.getString("description"));
        TextView textView = bVar.f36265e;
        if (zIsEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setText(jVar.getString("description"));
            textView.setVisibility(0);
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(jVar.getString("description"));
        bVar.itemView.setTag(jVar.getParseFile("picture"));
        bVar.f36263c.setVisibility(8);
        bVar.f36262b.setVisibility(8);
        ProgressBar progressBar = bVar.f36264d;
        progressBar.setVisibility(0);
        if (jVar.getParseFile("picture") == null) {
            progressBar.setVisibility(8);
            return;
        }
        e eVarD = com.bumptech.glide.b.d(bVar.itemView);
        eVarD.getClass();
        d dVarA = new d(eVarD.f24498b, eVarD, Bitmap.class, eVarD.f24499c).a(e.f24497m);
        dVarA.f24494z = jVar.getParseFile("picture").getUrl();
        dVarA.f24488B = true;
        dVarA.w(new y(bVar, jVar, zIsEmpty2), dVarA, X3.e.f7203a);
    }

    @Override // p110i9.h
    public final RecyclerView.B e(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new b(layoutInflater.inflate(R.layout.manual_step_list_item, viewGroup, false));
    }

    @Override // p110i9.h
    public final void j(View view) {
        ShapeableImageView shapeableImageView = (ShapeableImageView) view.findViewById(R.id.manualListHeader_cover);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.manualListHeader_progress);
        TextView textView = (TextView) view.findViewById(R.id.manualListHeader_name);
        i iVar = this.f36257g;
        textView.setText(iVar.getString("name"));
        if (iVar.getParseFile("picture") == null) {
            return;
        }
        if (shapeableImageView.getTag() == null || !shapeableImageView.getTag().equals(iVar.getParseFile("picture").getUrl())) {
            shapeableImageView.setVisibility(0);
            e eVarD = com.bumptech.glide.b.d(shapeableImageView);
            eVarD.getClass();
            d dVarA = new d(eVarD.f24498b, eVarD, Bitmap.class, eVarD.f24499c).a(e.f24497m);
            dVarA.f24494z = iVar.getParseFile("picture").getUrl();
            dVarA.f24488B = true;
            T3.d dVarJ = ((T3.d) E0.a(R.drawable.manual_default)).f(R.drawable.manual_default).j(R.drawable.manual_default);
            kotlin.jvm.internal.i.d(dVarJ, "placeholder(...)");
            d dVarA2 = dVarA.a(dVarJ);
            dVarA2.y(new a(progressBar, shapeableImageView));
            dVarA2.x(shapeableImageView);
        }
    }
}
