package com.psp.android_bluetooth_library;

/**
 * Модификация системного просмотощика документов
 */
public class AssetsFilesHandler {

	/**
	 * Конструктор
	 */
	public AssetsFilesHandler() {


	}

//	private void copyFile(final String filename) {
//		final AssetManager assetManager = isyService.getAssets();
//		final InputStream in;
//		final OutputStream out;
//		try {
//			in = assetManager.open(filename);
//			@SuppressLint("SdCardPath")
//			String newFileName = "/data/data/" + isyService.getPackageName() + "/" + filename;
//			out = new FileOutputStream(newFileName);
//
//			final byte[] buffer = new byte[1024];
//			int read;
//			while ((read = in.read(buffer)) != -1) {
//				out.write(buffer, 0, read);
//			}
//			in.close();
//			out.flush();
//			out.close();
//		} catch (final Exception e) {
//			Log.e("tag", Objects.requireNonNull(e.getMessage()));
//		}
//	}
}