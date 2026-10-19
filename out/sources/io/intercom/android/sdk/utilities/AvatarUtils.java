package io.intercom.android.sdk.utilities;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import coil.request.e;
import coil.request.g;
import coil.request.o;
import coil.util.b;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.utilities.coil.AvatarShapeTransformation;
import io.intercom.android.sdk.views.AvatarDefaultDrawable;
import io.intercom.android.sdk.views.AvatarInitialsDrawable;
import kotlin.collections.k;
import p016b3.d;

/* JADX INFO: loaded from: classes.dex */
public class AvatarUtils {
    public static void createAvatar(Avatar avatar, ImageView imageView, int i10, AppConfig appConfig) {
        Context context = imageView.getContext();
        g.a avatarImageRequestBuilder = getAvatarImageRequestBuilder(context, avatar, appConfig);
        avatarImageRequestBuilder.f(imageView);
        IntercomCoilKt.loadIntercomImage(context, avatarImageRequestBuilder.a());
    }

    public static g.a getAvatarImageRequestBuilder(Context context, Avatar avatar, AppConfig appConfig) {
        Drawable placeHolderDrawable = getPlaceHolderDrawable(context, avatar, appConfig);
        String strSelectUrlForTheme = ThemeUtils.selectUrlForTheme(context, avatar.getImageUrl(), avatar.getImageDarkUrl());
        g.a aVar = new g.a(context);
        aVar.f23074c = strSelectUrlForTheme;
        aVar.f23090t = placeHolderDrawable;
        aVar.f23089s = 0;
        aVar.f23092v = placeHolderDrawable;
        aVar.f23091u = 0;
        aVar.b();
        aVar.f23080i = b.a(k.d0(new d[]{new AvatarShapeTransformation(avatar.getShape())}));
        return aVar;
    }

    public static AvatarDefaultDrawable getDefaultDrawable(Context context, AppConfig appConfig) {
        return new AvatarDefaultDrawable(context, appConfig.getSecondaryColorDark());
    }

    public static AvatarInitialsDrawable getInitialsDrawable(String str, AppConfig appConfig) {
        return new AvatarInitialsDrawable(str.toUpperCase(), appConfig.getSecondaryColorDark());
    }

    public static Drawable getPlaceHolderDrawable(Context context, Avatar avatar, AppConfig appConfig) {
        return avatar.getInitials().isEmpty() ? getDefaultDrawable(context, appConfig) : getInitialsDrawable(avatar.getInitials(), appConfig);
    }

    public static void loadAvatarIntoView(Avatar avatar, ImageView imageView, AppConfig appConfig) {
        createAvatar(avatar, imageView, 0, appConfig);
    }

    public static void preloadAvatar(Avatar avatar, final Runnable runnable, Activity activity) {
        String strSelectUrlForTheme = ThemeUtils.selectUrlForTheme(activity, avatar.getImageUrl(), avatar.getImageDarkUrl());
        if (strSelectUrlForTheme == null || strSelectUrlForTheme.isEmpty()) {
            runnable.run();
            return;
        }
        g.a aVar = new g.a(activity);
        aVar.f23074c = strSelectUrlForTheme;
        aVar.f23076e = new g.b() { // from class: io.intercom.android.sdk.utilities.AvatarUtils.1
            @Override // coil.request.g.b
            public void onError(g gVar, e eVar) {
                runnable.run();
            }

            @Override // coil.request.g.b
            public void onSuccess(g gVar, o oVar) {
                runnable.run();
            }

            @Override // coil.request.g.b
            public void onCancel(g gVar) {
            }

            @Override // coil.request.g.b
            public void onStart(g gVar) {
            }
        };
        IntercomCoilKt.loadIntercomImage(activity, aVar.a());
    }
}
