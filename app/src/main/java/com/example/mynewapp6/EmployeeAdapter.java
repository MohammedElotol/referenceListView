package com.example.mynewapp6;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class EmployeeAdapter extends BaseAdapter{

	Context context;
	List<Employee> employees;
	int layoutId;
	
	public EmployeeAdapter(Context context, int layoutId, List<Employee> employees){
		this.context = context;
		this.employees = employees;
		this.layoutId = layoutId;
	}
	
	@Override
	public int getCount() {
		return employees.size();
	}

	@Override
	public Object getItem(int position) {
		return this.employees.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if(convertView == null){
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(layoutId, null);

            holder = new ViewHolder();
            holder.holdedTextView= (TextView) convertView.findViewById(R.id.tvName);
            holder.holdedImageView= (ImageView) convertView.findViewById(R.id.empPhoto);
            convertView.setTag(holder);


            convertView.setTag(holder);
		}else{
            holder = (ViewHolder) convertView.getTag();
		}
        holder.holdedTextView.setText(employees.get(position).getName());
        holder.holdedImageView.setImageDrawable(employees.get(position).getPhoto());

		return convertView;
	}

    static class ViewHolder{
        TextView holdedTextView;
        ImageView holdedImageView;
    }

}
