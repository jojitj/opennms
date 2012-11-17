package org.opennms.features.topology.api;

import org.opennms.features.topology.api.topo.Vertex;
import org.opennms.features.topology.api.topo.VertexRef;

public interface Layout {
	
	public static class Point {
		private int m_x;
		private int m_y;
		
		public Point(int x, int y) {
			m_x = x;
			m_y = y;
		}
		
		public int getX() { return m_x; }
		public int getY() { return m_y; }

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + m_x;
			result = prime * result + m_y;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Point other = (Point) obj;
			if (m_x != other.m_x)
				return false;
			if (m_y != other.m_y)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "(" + m_x + "," + m_y + ")";
		}

	}
	
	Point getLocation(VertexRef v);
	
	void setLocation(VertexRef vertex, int x, int y);

	void setLocation(VertexRef v, Point location);

	Point getInitialLocation(VertexRef v);
	
}